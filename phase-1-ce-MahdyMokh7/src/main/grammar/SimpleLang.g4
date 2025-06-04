grammar SimpleLang;

@header{
    import main.ast.nodes.*;
}

program returns [Program programRet]
  : { $programRet = new Program(); }
    (t = translationUnit {
        $programRet.setTranslationUnit($t.translationUnitRet);
        $programRet.setLine($t.translationUnitRet.getLine());
    })? EOF
  ;

translationUnit returns [TranslationUnit translationUnitRet]
  : { $translationUnitRet = new TranslationUnit(); }
    (ext = externalDeclaration {
        $translationUnitRet.addExternalDeclaration($ext.externalDeclarationRet);
        if ($translationUnitRet.getLine() == 0)
            $translationUnitRet.setLine($ext.externalDeclarationRet.getLine());
    })+
  ;

externalDeclaration returns [ExternalDeclaration externalDeclarationRet]
  : (f = functionDefinition {
        $externalDeclarationRet = $f.functionDefinitionRet;
        $externalDeclarationRet.setLine($f.functionDefinitionRet.getLine());
    })
  | (d = declaration {
        $externalDeclarationRet = $d.declarationRet;
        $externalDeclarationRet.setLine($d.declarationRet.getLine());
    })
  | Semi {
        $externalDeclarationRet = new StraySemicolonNode();
        $externalDeclarationRet.setLine($Semi.line);
    } // stray
  ;

functionDefinition returns [FunctionDefinition functionDefinitionRet]
  : { $functionDefinitionRet = new FunctionDefinition(); }
    (ds = declarationSpecifiers {
        $functionDefinitionRet.setDeclarationSpecifiers($ds.declarationSpecifiersRet);
    })?
    (d = declarator {
        $functionDefinitionRet.setDeclarator($d.declaratorRet);
        $functionDefinitionRet.setLine($d.declaratorRet.getLine());
    })
    (dl = declarationList {
        $functionDefinitionRet.setDeclarationList($dl.declarationListRet);
    })?
    (cs = compoundStatement {
        $functionDefinitionRet.setCompoundStatement($cs.compoundStatementRet);
    })
  ;

declarationList returns [DeclarationList declarationListRet]
  : { $declarationListRet = new DeclarationList(); }
    (d = declaration {
        $declarationListRet.addDeclaration($d.declarationRet);
        if ($declarationListRet.getLine() == 0)
            $declarationListRet.setLine($d.declarationRet.getLine());
    })+
  ;


expression returns [Expression expressionRet]
  : (id = Identifier {
      $expressionRet = new Identifier($id.getText());
      $expressionRet.setLine($id.line);
    })
  | (c = Constant {
      $expressionRet = new ConstantExpression($c.getText());
      $expressionRet.setLine($c.line);
    })
  | { $expressionRet = new StringLiteralExpression(); }
    (s = StringLiteral {
      ((StringLiteralExpression)$expressionRet).addPart($s.getText());
      $expressionRet.setLine($s.line);
    })+
  | LeftParen (e = expression {
        $expressionRet = $e.expressionRet;
        $expressionRet.setLine($e.expressionRet.getLine());
    }) RightParen
  | LeftParen t=typeName RightParen LeftBrace i=initializerList Comma? RightBrace {
      $expressionRet = new CompoundLiteralExpression($t.typeNameRet, $i.initializerListRet);
      $expressionRet.setLine($t.typeNameRet.getLine());
    }
  | arr=expression LeftBracket index=expression RightBracket {
      $expressionRet = new ArrayAccessExpression($arr.expressionRet, $index.expressionRet);
      $expressionRet.setLine($arr.expressionRet.getLine());
    }  // Array Indexing
  | func=expression LeftParen (a=argumentExpressionList {
      $expressionRet = new FunctionCallExpression();
      ((FunctionCallExpression) $expressionRet).setFunction($func.expressionRet);
      ((FunctionCallExpression) $expressionRet).setArguments($a.argumentExpressionListRet);
      $expressionRet.setLine($func.expressionRet.getLine());
    })? RightParen
    {
      if ($expressionRet == null) {
        FunctionCallExpression call = new FunctionCallExpression();
        call.setFunction($func.expressionRet);
        call.setArguments(null);
        call.setLine($func.expressionRet.getLine());
        $expressionRet = call;
      }
    }
  | operand=expression op=PlusPlus {
      UnaryPostfixExpression postfix = new UnaryPostfixExpression();
      postfix.setOperand($operand.expressionRet);
      postfix.setOperator($op.getText());
      postfix.setLine($op.line);
      $expressionRet = postfix;
    }
  | operand=expression op=MinusMinus {
      UnaryPostfixExpression postfix = new UnaryPostfixExpression();
      postfix.setOperand($operand.expressionRet);
      postfix.setOperator($op.getText());
      postfix.setLine($op.line);
      $expressionRet = postfix;
    }
  | { $expressionRet = new UnaryPrefixExpression(); }  // prefix operators (zero or more)
     (op=(PlusPlus | MinusMinus | Sizeof) {
         ((UnaryPrefixExpression) $expressionRet).addOperator($op.getText());
         if ($expressionRet.getLine() == 0) $expressionRet.setLine($op.line);
     })*
     (
       id=Identifier {
           ((UnaryPrefixExpression) $expressionRet).setOperand(new Identifier($id.getText()));
           if ($expressionRet.getLine() == 0) $expressionRet.setLine($id.line);
       }
     | cons=Constant {
           ((UnaryPrefixExpression) $expressionRet).setOperand(new ConstantExpression($cons.getText()));
           if ($expressionRet.getLine() == 0) $expressionRet.setLine($cons.line);
       }
     | { StringLiteralExpression sle = new StringLiteralExpression(); }
       (s=StringLiteral { sle.addPart($s.getText()); })+ {
           ((UnaryPrefixExpression) $expressionRet).setOperand(sle);
           $expressionRet.setLine($s.line); // from first matched string literal
       }
     | LeftParen e=expression RightParen {
           ((UnaryPrefixExpression) $expressionRet).setOperand($e.expressionRet);
           if ($expressionRet.getLine() == 0) $expressionRet.setLine($e.expressionRet.getLine());
       }
     | LeftParen t=typeName RightParen LeftBrace i=initializerList Comma? RightBrace {
           ((UnaryPrefixExpression) $expressionRet).setOperand(
               new CompoundLiteralExpression($t.typeNameRet, $i.initializerListRet)
           );
           if ($expressionRet.getLine() == 0) $expressionRet.setLine($t.typeNameRet.getLine());
       }
     | u=unaryOperator cex=castExpression {
           UnaryOperatorCastExpression uoce = new UnaryOperatorCastExpression($u.unaryOperatorRet, $cex.castExpressionRet);
           uoce.setLine($u.unaryOperatorRet.getLine());
           ((UnaryPrefixExpression) $expressionRet).setOperand(uoce);
           if ($expressionRet.getLine() == 0) $expressionRet.setLine(uoce.getLine()); // optional fallback
       }

     | Sizeof LeftParen t=typeName RightParen {
           ((UnaryPrefixExpression) $expressionRet).setOperand(new SizeofTypeExpression($t.typeNameRet));
           if ($expressionRet.getLine() == 0) $expressionRet.setLine($t.typeNameRet.getLine());
       }
     )

  | LeftParen t=typeName RightParen cexpr=castExpression {
        TypedCast typed = new TypedCast();
        typed.setType($t.typeNameRet);
        typed.setCastExpression($cexpr.castExpressionRet);
        typed.setLine($t.typeNameRet.getLine());
        $expressionRet = typed;
    }

  | left=expression op=(Star | Div | Mod) right=expression  // multiplicative
    {
      BinaryExpression bin = new BinaryExpression();
      bin.setLeft($left.expressionRet);
      bin.setOperator($op.getText());
      bin.setRight($right.expressionRet);
      bin.setLine($op.line);
      $expressionRet = bin;
    }

  | left=expression op=(Plus | Minus) right=expression
      {
        BinaryExpression bin = new BinaryExpression();
        bin.setLeft($left.expressionRet);
        bin.setOperator($op.getText());
        bin.setRight($right.expressionRet);
        bin.setLine($op.line);
        $expressionRet = bin;
      }

  | left=expression op=(LeftShift | RightShift) right=expression
      {
        BinaryExpression bin = new BinaryExpression();
        bin.setLeft($left.expressionRet);
        bin.setOperator($op.getText());
        bin.setRight($right.expressionRet);
        bin.setLine($op.line);
        $expressionRet = bin;
      }

  | left=expression op=(Less | Greater | LessEqual | GreaterEqual) right=expression  // relational
    {
      BinaryExpression bin = new BinaryExpression();
      bin.setLeft($left.expressionRet);
      bin.setOperator($op.getText());
      bin.setRight($right.expressionRet);
      bin.setLine($op.line);
      $expressionRet = bin;
    }
  | left=expression op=(Equal | NotEqual) right=expression  // Equality
    {
      BinaryExpression bin = new BinaryExpression();
      bin.setLeft($left.expressionRet);
      bin.setOperator($op.getText());
      bin.setRight($right.expressionRet);
      bin.setLine($op.line);
      $expressionRet = bin;
    }

  | left=expression op=And right=expression  // bitwise AND
    {
      BinaryExpression bin = new BinaryExpression();
      bin.setLeft($left.expressionRet);
      bin.setOperator($op.getText());
      bin.setRight($right.expressionRet);
      bin.setLine($op.line);
      $expressionRet = bin;
    }

  | left=expression op=Xor right=expression
    {
      BinaryExpression bin = new BinaryExpression(); // Bitwise XOR
      bin.setLeft($left.expressionRet);
      bin.setOperator($op.getText());
      bin.setRight($right.expressionRet);
      bin.setLine($op.line);
      $expressionRet = bin;
    }

  | left=expression op=Or right=expression
    {
      BinaryExpression bin = new BinaryExpression(); // Bitwise OR
      bin.setLeft($left.expressionRet);
      bin.setOperator($op.getText());
      bin.setRight($right.expressionRet);
      bin.setLine($op.line);
      $expressionRet = bin;
    }

  | left=expression op=AndAnd right=expression
    {
      BinaryExpression bin = new BinaryExpression(); // Logical AND
      bin.setLeft($left.expressionRet);
      bin.setOperator($op.getText());
      bin.setRight($right.expressionRet);
      bin.setLine($op.line);
      $expressionRet = bin;
    }

  | left=expression op=OrOr right=expression
    {
      BinaryExpression bin = new BinaryExpression(); // Logical OR
      bin.setLeft($left.expressionRet);
      bin.setOperator($op.getText());
      bin.setRight($right.expressionRet);
      bin.setLine($op.line);
      $expressionRet = bin;
    }

  | condition=expression Question ifTrue=expression Colon ifFalse=expression
      {
        ConditionalExpression cond = new ConditionalExpression();
        cond.setCondition($condition.expressionRet);
        cond.setIfTrue($ifTrue.expressionRet);
        cond.setIfFalse($ifFalse.expressionRet);
        cond.setLine($condition.expressionRet.getLine());
        $expressionRet = cond;
      }


  | left=expression oppp=assignmentOperator right=expression
      {
        AssignmentExpression assign = new AssignmentExpression();
        assign.setLeft($left.expressionRet);
        assign.setOperator($oppp.assignmentOperatorRet);
        assign.setRight($right.expressionRet);
        assign.setLine($oppp.start.getLine());
        $expressionRet = assign;
      }

  | firstexp=expression (Comma rest+=expression)+
      {
        CommaExpression comma = new CommaExpression();
        comma.addExpression($firstexp.expressionRet);
        for (ExpressionContext exprCtx : $rest)
            comma.addExpression(exprCtx.expressionRet);
        comma.setLine($firstexp.expressionRet.getLine());
        $expressionRet = comma;
      }
  ;

argumentExpressionList returns [ArgumentExpressionList argumentExpressionListRet]
  : { $argumentExpressionListRet = new ArgumentExpressionList(); }
    e1 = expression {
      $argumentExpressionListRet.setFirst($e1.expressionRet);
      $argumentExpressionListRet.setLine($e1.expressionRet.getLine());
    }
    (Comma e2 = expression {
      $argumentExpressionListRet.addRest($e2.expressionRet);
    })*
  ;

unaryOperator returns [UnaryOperator unaryOperatorRet]
  : { $unaryOperatorRet = new UnaryOperator(); } (And { $unaryOperatorRet.setOperator($And.getText()); $unaryOperatorRet.setLine($And.line); })
  | { $unaryOperatorRet = new UnaryOperator(); } (Star { $unaryOperatorRet.setOperator($Star.getText()); $unaryOperatorRet.setLine($Star.line); })
  | { $unaryOperatorRet = new UnaryOperator(); } (Plus { $unaryOperatorRet.setOperator($Plus.getText()); $unaryOperatorRet.setLine($Plus.line); })
  | { $unaryOperatorRet = new UnaryOperator(); } (Minus { $unaryOperatorRet.setOperator($Minus.getText()); $unaryOperatorRet.setLine($Minus.line); })
  | { $unaryOperatorRet = new UnaryOperator(); } (Tilde { $unaryOperatorRet.setOperator($Tilde.getText()); $unaryOperatorRet.setLine($Tilde.line); })
  | { $unaryOperatorRet = new UnaryOperator(); } (Not { $unaryOperatorRet.setOperator($Not.getText()); $unaryOperatorRet.setLine($Not.line); })
  ;

castExpression returns [CastExpression castExpressionRet]
  : LeftParen t=typeName RightParen c=castExpression
    {
      $castExpressionRet = new TypedCastExpression($t.typeNameRet, $c.castExpressionRet);
      $castExpressionRet.setLine($t.typeNameRet.getLine());
    }

  | e=expression
    {
      $castExpressionRet = $e.expressionRet;
    }

  | d=DigitSequence
    {
      $castExpressionRet = new DigitSequenceCast($d.getText());
      $castExpressionRet.setLine($d.line);
    }
  ;

assignmentOperator returns [AssignmentOperator assignmentOperatorRet]
  : Assign            { $assignmentOperatorRet = new AssignmentOperator($Assign.getText()); $assignmentOperatorRet.setLine($Assign.line); }
  | StarAssign        { $assignmentOperatorRet = new AssignmentOperator($StarAssign.getText()); $assignmentOperatorRet.setLine($StarAssign.line); }
  | DivAssign         { $assignmentOperatorRet = new AssignmentOperator($DivAssign.getText()); $assignmentOperatorRet.setLine($DivAssign.line); }
  | ModAssign         { $assignmentOperatorRet = new AssignmentOperator($ModAssign.getText()); $assignmentOperatorRet.setLine($ModAssign.line); }
  | PlusAssign        { $assignmentOperatorRet = new AssignmentOperator($PlusAssign.getText()); $assignmentOperatorRet.setLine($PlusAssign.line); }
  | MinusAssign       { $assignmentOperatorRet = new AssignmentOperator($MinusAssign.getText()); $assignmentOperatorRet.setLine($MinusAssign.line); }
  | LeftShiftAssign   { $assignmentOperatorRet = new AssignmentOperator($LeftShiftAssign.getText()); $assignmentOperatorRet.setLine($LeftShiftAssign.line); }
  | RightShiftAssign  { $assignmentOperatorRet = new AssignmentOperator($RightShiftAssign.getText()); $assignmentOperatorRet.setLine($RightShiftAssign.line); }
  | AndAssign         { $assignmentOperatorRet = new AssignmentOperator($AndAssign.getText()); $assignmentOperatorRet.setLine($AndAssign.line); }
  | XorAssign         { $assignmentOperatorRet = new AssignmentOperator($XorAssign.getText()); $assignmentOperatorRet.setLine($XorAssign.line); }
  | OrAssign          { $assignmentOperatorRet = new AssignmentOperator($OrAssign.getText()); $assignmentOperatorRet.setLine($OrAssign.line); }
  ;

declaration returns [Declaration declarationRet]
  : ds=declarationSpecifiers (idl=initDeclaratorList { $declarationRet = new Declaration($ds.declarationSpecifiersRet, $idl.initDeclaratorListRet); })? Semi
    {
      if ($declarationRet == null)
        $declarationRet = new Declaration($ds.declarationSpecifiersRet, null);
      $declarationRet.setLine($ds.declarationSpecifiersRet.getLine());
    }
  ;


declarationSpecifiers returns [DeclarationSpecifiers declarationSpecifiersRet]
  : first=declarationSpecifier rest+=declarationSpecifier*
  {
    DeclarationSpecifiers specs = new DeclarationSpecifiers();
    specs.addSpecifier($first.declarationSpecifierRet);
    for (DeclarationSpecifierContext r : $rest)
        specs.addSpecifier(r.declarationSpecifierRet);
    specs.setLine($first.declarationSpecifierRet.getLine());
    $declarationSpecifiersRet = specs;
  }
  ;

declarationSpecifier returns [DeclarationSpecifier declarationSpecifierRet]
  : t=Typedef   { $declarationSpecifierRet = new KeywordSpecifier($t.getText()); $declarationSpecifierRet.setLine($t.line); }
  | c=Const     { $declarationSpecifierRet = new KeywordSpecifier($c.getText()); $declarationSpecifierRet.setLine($c.line); }
  | ts=typeSpecifier { $declarationSpecifierRet = $ts.typeSpecifierRet; }
  ;

initDeclaratorList returns [InitDeclaratorList initDeclaratorListRet]
  : firstini=initDeclarator (Comma rest+=initDeclarator)*
  {
    InitDeclaratorList list = new InitDeclaratorList();
    list.addInitDeclarator($firstini.initDeclaratorRet);
    for (InitDeclaratorContext i : $rest)
        list.addInitDeclarator(i.initDeclaratorRet);
    list.setLine($firstini.initDeclaratorRet.getLine());
    $initDeclaratorListRet = list;
  }
  ;

initDeclarator returns [InitDeclarator initDeclaratorRet]
  : d=declarator (Assign i=initializer {
      $initDeclaratorRet = new InitDeclarator($d.declaratorRet, $i.initializerRet);
      $initDeclaratorRet.setLine($d.declaratorRet.getLine());
    })?
  {
    if ($initDeclaratorRet == null) {
      $initDeclaratorRet = new InitDeclarator($d.declaratorRet, null);
      $initDeclaratorRet.setLine($d.declaratorRet.getLine());
    }
  }
  ;

typeSpecifier returns [TypeSpecifier typeSpecifierRet]
  : Void      { $typeSpecifierRet = new VoidType(); $typeSpecifierRet.setLine($Void.line); }
  | Char      { $typeSpecifierRet = new CharType(); $typeSpecifierRet.setLine($Char.line); }
  | Short     { $typeSpecifierRet = new ShortType(); $typeSpecifierRet.setLine($Short.line); }
  | Int       { $typeSpecifierRet = new IntType(); $typeSpecifierRet.setLine($Int.line); }
  | Long      { $typeSpecifierRet = new LongType(); $typeSpecifierRet.setLine($Long.line); }
  | Float     { $typeSpecifierRet = new FloatType(); $typeSpecifierRet.setLine($Float.line); }
  | Double    { $typeSpecifierRet = new DoubleType(); $typeSpecifierRet.setLine($Double.line); }
  | Signed    { $typeSpecifierRet = new SignedType(); $typeSpecifierRet.setLine($Signed.line); }
  | Unsigned  { $typeSpecifierRet = new UnsignedType(); $typeSpecifierRet.setLine($Unsigned.line); }
  | Bool      { $typeSpecifierRet = new BoolType(); $typeSpecifierRet.setLine($Bool.line); }
  | id=Identifier { $typeSpecifierRet = new Identifier($id.getText()); $typeSpecifierRet.setLine($id.line); }
  ;

specifierQualifierList returns [SpecifierQualifierList specifierQualifierListRet]
  : (ts=typeSpecifier {
        $specifierQualifierListRet = new SpecifierQualifierList();
        $specifierQualifierListRet.addSpecifier($ts.typeSpecifierRet);
        $specifierQualifierListRet.setLine($ts.typeSpecifierRet.getLine());
    }
    | c=Const {
        $specifierQualifierListRet = new SpecifierQualifierList();
        KeywordSpecifier ks = new KeywordSpecifier($c.getText());
        ks.setLine($c.line);
        $specifierQualifierListRet.addSpecifier(ks);
        $specifierQualifierListRet.setLine($c.line);
    })
    (rest=specifierQualifierList {
        $specifierQualifierListRet.addAll($rest.specifierQualifierListRet);
    })?
  ;

declarator returns [Declarator declaratorRet]
  : (p=pointer {
        Declarator d = new Declarator();
        d.setPointer($p.pointerRet);
        d.setLine($p.pointerRet.getLine());
        $declaratorRet = d;
    })?
    ddir=directDeclarator
  {
    if ($declaratorRet == null) {
      $declaratorRet = new Declarator();
      $declaratorRet.setLine($ddir.directDeclaratorRet.getLine());
    }
    $declaratorRet.setDirectDeclarator($ddir.directDeclaratorRet);
  }
  ;

directDeclarator returns [DirectDeclarator directDeclaratorRet]
  : id=Identifier
    {
      $directDeclaratorRet = new Identifier($id.getText());
      $directDeclaratorRet.setLine($id.line);
    }

  | LeftParen d=declarator RightParen
    {
      $directDeclaratorRet = new DirectDeclaratorParen($d.declaratorRet);
      $directDeclaratorRet.setLine($d.declaratorRet.getLine());
    }

  | base=directDeclarator LeftBracket
      (e=expression {
        $directDeclaratorRet = new DirectDeclaratorArray($base.directDeclaratorRet, $e.expressionRet);
        $directDeclaratorRet.setLine($base.directDeclaratorRet.getLine());
      })?
    RightBracket
    {
      if ($directDeclaratorRet == null) {
        $directDeclaratorRet = new DirectDeclaratorArray($base.directDeclaratorRet, null);
        $directDeclaratorRet.setLine($base.directDeclaratorRet.getLine());
      }
    }

  | base=directDeclarator LeftParen
      (
        plist=parameterList {
          $directDeclaratorRet = new DirectDeclaratorFunctionParams($base.directDeclaratorRet, $plist.parameterListRet);
          $directDeclaratorRet.setLine($base.directDeclaratorRet.getLine());
        }
      |
        idlist=identifierList {
          $directDeclaratorRet = new DirectDeclaratorFunctionIds($base.directDeclaratorRet, $idlist.identifierListRet);
          $directDeclaratorRet.setLine($base.directDeclaratorRet.getLine());
        }
      )?
    RightParen
    {
      if ($directDeclaratorRet == null) {
        $directDeclaratorRet = new DirectDeclaratorFunctionEmpty($base.directDeclaratorRet);
        $directDeclaratorRet.setLine($base.directDeclaratorRet.getLine());
      }
    }
  ;

pointer returns [Pointer pointerRet]
  : (s=Star c+=Const* {
      if ($pointerRet == null)
        $pointerRet = new Pointer();
      $pointerRet.addLevel(!$c.isEmpty());
      if ($pointerRet.getLine() == 0) $pointerRet.setLine($s.line);
    })+
  ;

parameterList returns [ParameterList parameterListRet]
  : first=parameterDeclaration rest+=parameterDeclaration*
  {
    ParameterList list = new ParameterList();
    list.addParameter($first.parameterDeclarationRet);
    for (ParameterDeclarationContext p : $rest)
        list.addParameter(p.parameterDeclarationRet);
    list.setLine($first.parameterDeclarationRet.getLine());
    $parameterListRet = list;
  }
  ;

parameterDeclaration returns [ParameterDeclaration parameterDeclarationRet]
  : ds=declarationSpecifiers
    (
      d=declarator {
        $parameterDeclarationRet = new ParameterDeclaration($ds.declarationSpecifiersRet, $d.declaratorRet, null);
        $parameterDeclarationRet.setLine($d.declaratorRet.getLine());
      }
    |
      ad=abstractDeclarator {
        $parameterDeclarationRet = new ParameterDeclaration($ds.declarationSpecifiersRet, null, $ad.abstractDeclaratorRet);
        $parameterDeclarationRet.setLine($ad.abstractDeclaratorRet.getLine());
      }
    )
  ;

identifierList returns [IdentifierList identifierListRet]
  : first=Identifier rest+=Identifier* {
      $identifierListRet = new IdentifierList();
      $identifierListRet.addIdentifier($first.getText());
      for (Token t : $rest)
          $identifierListRet.addIdentifier(t.getText());
      $identifierListRet.setLine($first.line);
  }
  ;

typeName returns [TypeName typeNameRet]
  : sq=specifierQualifierList
    (ad=abstractDeclarator {
      $typeNameRet = new TypeName($sq.specifierQualifierListRet, $ad.abstractDeclaratorRet);
      $typeNameRet.setLine($sq.specifierQualifierListRet.getLine());
    })?
    {
      if ($typeNameRet == null) {
        $typeNameRet = new TypeName($sq.specifierQualifierListRet, null);
        $typeNameRet.setLine($sq.specifierQualifierListRet.getLine());
      }
    }
  ;

abstractDeclarator returns [AbstractDeclarator abstractDeclaratorRet]
  : p=pointer
    {
      $abstractDeclaratorRet = new AbstractDeclaratorPointer($p.pointerRet);
      $abstractDeclaratorRet.setLine($p.pointerRet.getLine());
    }

  | d=directAbstractDeclarator
    {
      $abstractDeclaratorRet = new AbstractDeclaratorDirect($d.directAbstractDeclaratorRet);
      $abstractDeclaratorRet.setLine($d.directAbstractDeclaratorRet.getLine());
    }

  | p=pointer d=directAbstractDeclarator
    {
      $abstractDeclaratorRet = new AbstractDeclaratorPointerDirect($p.pointerRet, $d.directAbstractDeclaratorRet);
      $abstractDeclaratorRet.setLine($p.pointerRet.getLine());
    }
  ;

directAbstractDeclarator returns [DirectAbstractDeclarator directAbstractDeclaratorRet]
  : LeftBracket (e=expression {
      $directAbstractDeclaratorRet = new DirectAbstractDeclaratorArray($e.expressionRet);
      $directAbstractDeclaratorRet.setLine($e.expressionRet.getLine());
    })? RightBracket
    {
      if ($directAbstractDeclaratorRet == null) {
        $directAbstractDeclaratorRet = new DirectAbstractDeclaratorArray(null);
      }
    }

  | LeftParen
      (
        ad=abstractDeclarator {
          $directAbstractDeclaratorRet = new DirectAbstractDeclaratorParen(null, $ad.abstractDeclaratorRet);
          $directAbstractDeclaratorRet.setLine($ad.abstractDeclaratorRet.getLine());
        }
      |
        plist=parameterList {
          $directAbstractDeclaratorRet = new DirectAbstractDeclaratorParen($plist.parameterListRet, null);
          $directAbstractDeclaratorRet.setLine($plist.parameterListRet.getLine());
        }
      )?
    RightParen
    {
      if ($directAbstractDeclaratorRet == null) {
        $directAbstractDeclaratorRet = new DirectAbstractDeclaratorParen(null, null);
      }
    }

  | base=directAbstractDeclarator LeftBracket
      (e=expression {
        $directAbstractDeclaratorRet = new DirectAbstractDeclaratorArrayRecursive($base.directAbstractDeclaratorRet, $e.expressionRet);
        $directAbstractDeclaratorRet.setLine($base.directAbstractDeclaratorRet.getLine());
      })? RightBracket
    {
      if ($directAbstractDeclaratorRet == null) {
        $directAbstractDeclaratorRet = new DirectAbstractDeclaratorArrayRecursive($base.directAbstractDeclaratorRet, null);
        $directAbstractDeclaratorRet.setLine($base.directAbstractDeclaratorRet.getLine());
      }
    }

  | base=directAbstractDeclarator LeftParen
      (plist=parameterList {
        $directAbstractDeclaratorRet = new DirectAbstractDeclaratorCallRecursive($base.directAbstractDeclaratorRet, $plist.parameterListRet);
        $directAbstractDeclaratorRet.setLine($base.directAbstractDeclaratorRet.getLine());
      })? RightParen
    {
      if ($directAbstractDeclaratorRet == null) {
        $directAbstractDeclaratorRet = new DirectAbstractDeclaratorCallRecursive($base.directAbstractDeclaratorRet, null);
        $directAbstractDeclaratorRet.setLine($base.directAbstractDeclaratorRet.getLine());
      }
    }
  ;

initializer returns [Initializer initializerRet]
  : e=expression
    {
      $initializerRet = $e.expressionRet;
    }

  | LeftBrace il=initializerList Comma? RightBrace
    {
      $initializerRet = new InitializerListWrapper($il.initializerListRet);
      $initializerRet.setLine($il.initializerListRet.getLine());
    }
  ;

initializerList returns [InitializerList initializerListRet]
  : {
      $initializerListRet = new InitializerList();
    }
    (d1=designation i1=initializer {
        $initializerListRet.addEntry($d1.designationRet, $i1.initializerRet);
        $initializerListRet.setLine($d1.designationRet.getLine());
     }
    |
     i1=initializer {
        $initializerListRet.addEntry(null, $i1.initializerRet);
        $initializerListRet.setLine($i1.initializerRet.getLine());
     }
    )
    (Comma (
        d2=designation i2=initializer {
            $initializerListRet.addEntry($d2.designationRet, $i2.initializerRet);
        }
      |
        i2=initializer {
            $initializerListRet.addEntry(null, $i2.initializerRet);
        }
    ))*
  ;

designation returns [Designation designationRet]
  : ds+=designator+ Assign {
      $designationRet = new Designation();
      for (DesignatorContext d : $ds)
          $designationRet.addDesignator(d.designatorRet);
      $designationRet.setLine($ds.get(0).designatorRet.getLine());
  }
  ;

designator returns [Designator designatorRet]
  : LeftBracket e=expression RightBracket {
      $designatorRet = new ArrayIndexDesignator($e.expressionRet);
      $designatorRet.setLine($e.expressionRet.getLine());
    }

  | Dot id=Identifier {
      $designatorRet = new FieldDesignator($id.getText());
      $designatorRet.setLine($id.line);
    }
  ;

statement returns [Statement statementRet]
  : cs=compoundStatement {
      $statementRet = $cs.compoundStatementRet;
    }
  | es=expressionStatement {
      $statementRet = $es.expressionStatementRet;
    }
  | ss=selectionStatement {
      $statementRet = $ss.selectionStatementRet;
    }
  | is=iterationStatement {
      $statementRet = $is.iterationStatementRet;
    }
  | js=jumpStatement {
      $statementRet = $js.jumpStatementRet;
    }
  ;

compoundStatement returns [CompoundStatement compoundStatementRet]
  : LeftBrace (items+=blockItem+ {
      $compoundStatementRet = new CompoundStatement();
      for (BlockItemContext item : $items)
          $compoundStatementRet.addBlockItem(item.blockItemRet);
      $compoundStatementRet.setLine($items.get(0).blockItemRet.getLine());
    })?
    RightBrace
    {
      if ($compoundStatementRet == null) {
        $compoundStatementRet = new CompoundStatement();
      }
    }
  ;


blockItem returns [BlockItem blockItemRet]
  : s=statement     { $blockItemRet = $s.statementRet; }
  | d=declaration   { $blockItemRet = $d.declarationRet; }
  ;

expressionStatement returns [ExpressionStatement expressionStatementRet]
  : (e=expression {
      $expressionStatementRet = new ExpressionStatement($e.expressionRet);
      $expressionStatementRet.setLine($e.expressionRet.getLine());
    })?
    Semi
    {
      if ($expressionStatementRet == null) {
        $expressionStatementRet = new ExpressionStatement(null);
      }
    }
  ;

selectionStatement returns [SelectionStatement selectionStatementRet]
  : ifTok=If LeftParen cond=expression RightParen thenStmt=statement
    (elseTok=Else elseStmt=statement {
      $selectionStatementRet = new SelectionStatement($cond.expressionRet, $thenStmt.statementRet, $elseStmt.statementRet);

      if ($elseStmt.statementRet != null)
          $elseStmt.statementRet.setLine($elseTok.getLine());

      $selectionStatementRet.setLine($ifTok.getLine());
    })?
    {
      if ($selectionStatementRet == null) {
        $selectionStatementRet = new SelectionStatement($cond.expressionRet, $thenStmt.statementRet, null);
        $selectionStatementRet.setLine($ifTok.getLine());
      }
    }
  ;



iterationStatement returns [IterationStatement iterationStatementRet]
  : whileTok=While LeftParen cond=expression RightParen body=statement {
      $iterationStatementRet = new WhileStatement($cond.expressionRet, $body.statementRet);
      $iterationStatementRet.setLine($whileTok.getLine());
    }
  | doTok=Do body=statement While LeftParen cond=expression RightParen Semi {
      $iterationStatementRet = new DoWhileStatement($cond.expressionRet, $body.statementRet);
      $iterationStatementRet.setLine($doTok.getLine());
    }
  | forTok=For LeftParen fc=forCondition RightParen body=statement {
      $iterationStatementRet = new ForStatement($fc.forConditionRet, $body.statementRet);
      $iterationStatementRet.setLine($forTok.getLine());
    }
  ;

forCondition returns [ForCondition forConditionRet]
  : fd=forDeclaration Semi
    (fe1=forExpression Semi fe2=forExpression {
        $forConditionRet = new ForCondition($fd.forDeclarationRet, null, $fe1.forExpressionRet, $fe2.forExpressionRet);
        $forConditionRet.setLine($fd.forDeclarationRet.getLine());
    }
    | fe1=forExpression Semi {
        $forConditionRet = new ForCondition($fd.forDeclarationRet, null, $fe1.forExpressionRet, null);
        $forConditionRet.setLine($fd.forDeclarationRet.getLine());
    }
    | Semi fe2=forExpression {
        $forConditionRet = new ForCondition($fd.forDeclarationRet, null, null, $fe2.forExpressionRet);
        $forConditionRet.setLine($fd.forDeclarationRet.getLine());
    }
    | Semi {
        $forConditionRet = new ForCondition($fd.forDeclarationRet, null, null, null);
        $forConditionRet.setLine($fd.forDeclarationRet.getLine());
    }
    )

  | e=expression Semi
    (fe1=forExpression Semi fe2=forExpression {
        $forConditionRet = new ForCondition(null, $e.expressionRet, $fe1.forExpressionRet, $fe2.forExpressionRet);
        $forConditionRet.setLine($e.expressionRet.getLine());
    }
    | fe1=forExpression Semi {
        $forConditionRet = new ForCondition(null, $e.expressionRet, $fe1.forExpressionRet, null);
        $forConditionRet.setLine($e.expressionRet.getLine());
    }
    | Semi fe2=forExpression {
        $forConditionRet = new ForCondition(null, $e.expressionRet, null, $fe2.forExpressionRet);
        $forConditionRet.setLine($e.expressionRet.getLine());
    }
    | Semi {
        $forConditionRet = new ForCondition(null, $e.expressionRet, null, null);
        $forConditionRet.setLine($e.expressionRet.getLine());
    }
    )

  | Semi
    (fe1=forExpression Semi fe2=forExpression {
        $forConditionRet = new ForCondition(null, null, $fe1.forExpressionRet, $fe2.forExpressionRet);
        $forConditionRet.setLine($fe1.forExpressionRet.getLine());
    }
    | fe1=forExpression Semi {
        $forConditionRet = new ForCondition(null, null, $fe1.forExpressionRet, null);
        $forConditionRet.setLine($fe1.forExpressionRet.getLine());
    }
    | Semi fe2=forExpression {
        $forConditionRet = new ForCondition(null, null, null, $fe2.forExpressionRet);
        $forConditionRet.setLine($fe2.forExpressionRet.getLine());
    }
    | Semi {
        $forConditionRet = new ForCondition(null, null, null, null);
    }
    )
  ;

forDeclaration returns [ForDeclaration forDeclarationRet]
  : ds=declarationSpecifiers
    (idl=initDeclaratorList {
      $forDeclarationRet = new ForDeclaration($ds.declarationSpecifiersRet, $idl.initDeclaratorListRet);
      $forDeclarationRet.setLine($ds.declarationSpecifiersRet.getLine());
    })?
    {
      if ($forDeclarationRet == null) {
        $forDeclarationRet = new ForDeclaration($ds.declarationSpecifiersRet, null);
        $forDeclarationRet.setLine($ds.declarationSpecifiersRet.getLine());
      }
    }
  ;

forExpression returns [ForExpression forExpressionRet]
  : e1=expression {
      $forExpressionRet = new ForExpression();
      $forExpressionRet.addExpression($e1.expressionRet);
      $forExpressionRet.setLine($e1.expressionRet.getLine());
    }
    (Comma e2=expression {
      $forExpressionRet.addExpression($e2.expressionRet);
    })*
  ;

jumpStatement returns [JumpStatement jumpStatementRet]
  : Continue Semi {
      $jumpStatementRet = new ContinueStatement();
      $jumpStatementRet.setLine($Continue.line);
    }
  | Break Semi {
      $jumpStatementRet = new BreakStatement();
      $jumpStatementRet.setLine($Break.line);
    }
  | Return (e=expression {
      $jumpStatementRet = new ReturnStatement($e.expressionRet);
      $jumpStatementRet.setLine($e.expressionRet.getLine());
    })? Semi
    {
      if ($jumpStatementRet == null) {
        $jumpStatementRet = new ReturnStatement(null);
        $jumpStatementRet.setLine($Return.line);
      }
    }
  ;


Break                 : 'break'                 ;
Char                  : 'char'                  ;
Const                 : 'const'                 ;
Continue              : 'continue'              ;
Do                    : 'do'                    ;
Double                : 'double'                ;
Else                  : 'else'                  ;
Float                 : 'float'                 ;
For                   : 'for'                   ;
If                    : 'if'                    ;
Int                   : 'int'                   ;
Long                  : 'long'                  ;
Return                : 'return'                ;
Short                 : 'short'                 ;
Signed                : 'signed'                ;
Sizeof                : 'sizeof'                ;
Switch                : 'switch'                ;
Typedef               : 'typedef'               ;
Unsigned              : 'unsigned'              ;
Void                  : 'void'                  ;
While                 : 'while'                 ;
Bool                  : 'bool'                  ;
LeftParen             : '('                     ;
RightParen            : ')'                     ;
LeftBracket           : '['                     ;
RightBracket          : ']'                     ;
LeftBrace             : '{'                     ;
RightBrace            : '}'                     ;
Less                  : '<'                     ;
LessEqual             : '<='                    ;
Greater               : '>'                     ;
GreaterEqual          : '>='                    ;
LeftShift             : '<<'                    ;
RightShift            : '>>'                    ;
Plus                  : '+'                     ;
PlusPlus              : '++'                    ;
Minus                 : '-'                     ;
MinusMinus            : '--'                    ;
Star                  : '*'                     ;
Div                   : '/'                     ;
Mod                   : '%'                     ;
And                   : '&'                     ;
Or                    : '|'                     ;
AndAnd                : '&&'                    ;
OrOr                  : '||'                    ;
Xor                   : '^'                     ;
Not                   : '!'                     ;
Tilde                 : '~'                     ;
Question              : '?'                     ;
Colon                 : ':'                     ;
Semi                  : ';'                     ;
Comma                 : ','                     ;
Assign                : '='                     ;
StarAssign            : '*='                    ;
DivAssign             : '/='                    ;
ModAssign             : '%='                    ;
PlusAssign            : '+='                    ;
MinusAssign           : '-='                    ;
LeftShiftAssign       : '<<='                   ;
RightShiftAssign      : '>>='                   ;
AndAssign             : '&='                    ;
XorAssign             : '^='                    ;
OrAssign              : '|='                    ;
Equal                 : '=='                    ;
NotEqual              : '!='                    ;
Arrow                 : '->'                    ;
Dot                   : '.'                     ;

Identifier
    : IdentifierNondigit (IdentifierNondigit | Digit)* ;

fragment IdentifierNondigit
    : Nondigit | UniversalCharacterName ;

fragment Nondigit
    : [a-zA-Z_] ;

fragment Digit
    : [0-9] ;

fragment UniversalCharacterName
    : '\\u' HexQuad | '\\U' HexQuad HexQuad ;

fragment HexQuad
    : HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit ;

Constant
    : IntegerConstant | FloatingConstant | CharacterConstant ;

fragment IntegerConstant
    : DecimalConstant IntegerSuffix?
    | OctalConstant IntegerSuffix?
    | HexadecimalConstant IntegerSuffix?
    | BinaryConstant ;

fragment BinaryConstant
    : '0' [bB] [0-1]+ ;

fragment DecimalConstant
    : NonzeroDigit Digit* ;

fragment OctalConstant
    : '0' OctalDigit* ;

fragment HexadecimalConstant
    : HexadecimalPrefix HexadecimalDigit+ ;

fragment HexadecimalPrefix
    : '0' [xX] ;

fragment NonzeroDigit
    : [1-9] ;

fragment OctalDigit
    : [0-7] ;

fragment HexadecimalDigit
    : [0-9a-fA-F] ;

fragment IntegerSuffix
    : UnsignedSuffix LongSuffix? | UnsignedSuffix LongLongSuffix | LongSuffix UnsignedSuffix? | LongLongSuffix UnsignedSuffix? ;

fragment UnsignedSuffix
    : [uU] ;

fragment LongSuffix
    : [lL] ;

fragment LongLongSuffix
    : 'll' | 'LL' ;

fragment FloatingConstant
    : DecimalFloatingConstant | HexadecimalFloatingConstant ;

fragment DecimalFloatingConstant
    : FractionalConstant ExponentPart? FloatingSuffix? | DigitSequence ExponentPart FloatingSuffix? ;

fragment HexadecimalFloatingConstant
    : HexadecimalPrefix (HexadecimalFractionalConstant | HexadecimalDigitSequence) BinaryExponentPart FloatingSuffix? ;

fragment FractionalConstant
    : DigitSequence? Dot DigitSequence | DigitSequence Dot ;

fragment ExponentPart
    : [eE] Sign? DigitSequence ;

fragment Sign
    : [+-] ;

DigitSequence
    : Digit+ ;

fragment HexadecimalFractionalConstant
    : HexadecimalDigitSequence? Dot HexadecimalDigitSequence | HexadecimalDigitSequence Dot ;

fragment BinaryExponentPart
    : [pP] Sign? DigitSequence ;

fragment HexadecimalDigitSequence
    : HexadecimalDigit+ ;

fragment FloatingSuffix
    : [flFL] ;

fragment CharacterConstant
    : '\'' CCharSequence '\'' | 'L\'' CCharSequence '\''| 'u\'' CCharSequence '\'' | 'U\'' CCharSequence '\''
    ;

fragment CCharSequence
    : CChar+ ;

fragment CChar
    : ~['\\\r\n] | EscapeSequence ;

fragment EscapeSequence
    : SimpleEscapeSequence | OctalEscapeSequence | HexadecimalEscapeSequence | UniversalCharacterName ;

fragment SimpleEscapeSequence
    : '\\' ['"?abfnrtv\\] ;

fragment OctalEscapeSequence
    : '\\' OctalDigit OctalDigit? OctalDigit? ;

fragment HexadecimalEscapeSequence
    : '\\x' HexadecimalDigit+ ;

StringLiteral
    : EncodingPrefix? '"' SCharSequence? '"' ;

fragment EncodingPrefix
    : 'u8' | 'u' | 'U' | 'L' ;

fragment SCharSequence
    : SChar+ ;

fragment SChar
    : ~["\\\r\n] | EscapeSequence | '\\\n' | '\\\r\n' ;

MultiLineMacro
    : '#' (~[\n]*? '\\' '\r'? '\n')+ ~ [\n]+ -> channel(HIDDEN) ;

Directive
    : '#' ~[\n]* -> channel(HIDDEN) ;

Whitespace
    : [ \t]+ -> channel(HIDDEN) ;

Newline
    : ('\r' '\n'? | '\n') -> channel(HIDDEN) ;

BlockComment
    : '/*' .*? '*/' -> channel(HIDDEN) ;

LineComment
    : '//' ~[\r\n]* -> channel(HIDDEN) ;