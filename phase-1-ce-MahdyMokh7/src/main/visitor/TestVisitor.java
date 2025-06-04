package main.visitor;

import main.ast.nodes.*;
import java.util.List;

public class TestVisitor extends Visitor<Void> {

    @Override
    public Void visit(Program program) {
        if (program.getTranslationUnit() != null)
            program.getTranslationUnit().accept(this);
        return null;
    }

    @Override
    public Void visit(TranslationUnit tu) {
        for (ExternalDeclaration ed : tu.getExternalDeclarations())
            ed.accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDefinition fd) {
        DirectDeclarator directDeclarator = fd.getDeclarator().getDirectDeclarator();
        Identifier idNode = directDeclarator.unwrapToIdentifier();

        String name = idNode.getIdentifier();
        int line = fd.getLine();

        int stmtCount = 0;
        if (fd.getCompoundStatement() != null && fd.getCompoundStatement().getBlockItems() != null) {
            stmtCount = fd.getCompoundStatement().getBlockItems().size();
        }

        System.out.println("Line " + line + ": Stmt function " + name + " = " + stmtCount);
        fd.getCompoundStatement().accept(this);
        return null;
    }

    @Override
    public Void visit(StraySemicolonNode straySemicolonNode) {
        return null;
    }


    @Override
    public Void visit(CompoundStatement cs) {
        if (cs.getBlockItems() != null) {
            for (BlockItem item : cs.getBlockItems()) {
                if (item != null)
                    item.accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visit(DeclarationList declarationList) {
        for (Declaration decl : declarationList.getDeclarations()) {
            if (decl != null)
                decl.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(DeclarationSpecifiers declarationSpecifiers) {
        for (DeclarationSpecifier spec : declarationSpecifiers.getSpecifiers()) {
            if (spec != null)
                spec.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(Declarator declarator) {
        if (declarator.getPointer() != null)
            declarator.getPointer().accept(this);

        if (declarator.getDirectDeclarator() != null)
            declarator.getDirectDeclarator().accept(this);

        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        return null;
    }

    @Override
    public Void visit(ExpressionStatement es) {
        if (es.getExpression() != null) {
            es.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConstantExpression ce) {
        System.out.println("Line " + ce.getLine() + ": Expr " + ce.getValue());
        return null;
    }

    @Override
    public Void visit(StringLiteralExpression stringLiteralExpression) {
        return null;
    }

    @Override
    public Void visit(CompoundLiteralExpression compoundLiteralExpression) {
        System.out.println("Line " + compoundLiteralExpression.getLine() + ": Expr compound-literal");

        if (compoundLiteralExpression.getType() != null)
            compoundLiteralExpression.getType().accept(this);

        if (compoundLiteralExpression.getInitializerList() != null)
            compoundLiteralExpression.getInitializerList().accept(this);

        return null;
    }

    @Override
    public Void visit(TypeName typeName) {
        if (typeName.getSpecifierQualifierList() != null)
            typeName.getSpecifierQualifierList().accept(this);

        if (typeName.getAbstractDeclarator() != null)
            typeName.getAbstractDeclarator().accept(this);

        return null;
    }

    @Override
    public Void visit(ArrayAccessExpression arrayAccessExpression) {
        System.out.println("Line " + arrayAccessExpression.getLine() + ": Expr []");

        if (arrayAccessExpression.getArray() != null)
            arrayAccessExpression.getArray().accept(this);

        if (arrayAccessExpression.getIndex() != null)
            arrayAccessExpression.getIndex().accept(this);

        return null;
    }

    @Override
    public Void visit(FunctionCallExpression fce) {
        if (fce.getFunction() instanceof Identifier) {
            Identifier id = (Identifier) fce.getFunction();
            System.out.println("Line " + id.getLine() + ": Expr " + id.getIdentifier());
        } else {
            fce.getFunction().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(UnaryPostfixExpression unaryPostfixExpression) {
        System.out.println("Line " + unaryPostfixExpression.getLine() + ": Expr " + unaryPostfixExpression.getOperator());

        if (unaryPostfixExpression.getOperand() != null)
            unaryPostfixExpression.getOperand().accept(this);

        return null;
    }

    @Override
    public Void visit(UnaryPrefixExpression unaryPrefixExpression) {
        for (String op : unaryPrefixExpression.getOperators()) {
            if (op.equals("&")) continue;
            System.out.println("Line " + unaryPrefixExpression.getLine() + ": Expr " + op);
        }

        if (unaryPrefixExpression.getOperand() != null)
            unaryPrefixExpression.getOperand().accept(this);

        return null;
    }


    @Override
    public Void visit(BinaryExpression binaryExpression) {
        System.out.println("Line " + binaryExpression.getLine() + ": Expr " + binaryExpression.getOperator());
        return null;
    }


    @Override
    public Void visit(ConditionalExpression conditionalExpression) {
        System.out.println("Line " + conditionalExpression.getLine() + ": Expr ?:");
        if (conditionalExpression.getCondition() != null)
            conditionalExpression.getCondition().accept(this);
        if (conditionalExpression.getIfTrue() != null)
            conditionalExpression.getIfTrue().accept(this);
        if (conditionalExpression.getIfFalse() != null)
            conditionalExpression.getIfFalse().accept(this);
        return null;
    }

    @Override
    public Void visit(AssignmentExpression ae) {
        System.out.println("Line " + ae.getLine() + ": Expr " + ae.getOperator().getSymbol());
        if (ae.getLeft() != null)
            ae.getLeft().accept(this);
        return null;
    }




    @Override
    public Void visit(AssignmentOperator assignmentOperator) {
        return null;
    }

    @Override
    public Void visit(CommaExpression commaExpression) {
        System.out.println("Line " + commaExpression.getLine() + ": Expr ,");
        return null;
    }



    @Override
    public Void visit(ArgumentExpressionList argumentExpressionList) {
        for (Expression expr : argumentExpressionList.getExpressions()) {
            if (expr != null)
                expr.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(UnaryOperator unaryOperator) {
        return null;
    }

    @Override
    public Void visit(TypedCast typedCast) {
        System.out.println("Line " + typedCast.getLine() + ": Expr cast");

        if (typedCast.getType() != null)
            typedCast.getType().accept(this);

        if (typedCast.getCastExpression() != null)
            typedCast.getCastExpression().accept(this);

        return null;
    }

    @Override
    public Void visit(NullExpression nullExpression) {
        return null;
    }

    @Override
    public Void visit(InitDeclarator initDeclarator) {
        if (initDeclarator.getDeclarator() != null)
            initDeclarator.getDeclarator().accept(this);

        if (initDeclarator.getInitializer() != null)
            initDeclarator.getInitializer().accept(this);

        return null;
    }

    @Override
    public Void visit(KeywordSpecifier keywordSpecifier) {
        return null;
    }

    @Override
    public Void visit(Pointer pointer) {
        return null;
    }

    @Override
    public Void visit(IdentifierList identifierList) {
        return null;
    }

    @Override
    public Void visit(SpecifierQualifierList specifierQualifierList) {
        for (Node specifier : specifierQualifierList.getSpecifiers()) {
            if (specifier != null)
                specifier.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ParameterDeclaration parameterDeclaration) {
        if (parameterDeclaration.getSpecifiers() != null)
            parameterDeclaration.getSpecifiers().accept(this);

        if (parameterDeclaration.getDeclarator() != null)
            parameterDeclaration.getDeclarator().accept(this);

        if (parameterDeclaration.getAbstractDeclarator() != null)
            parameterDeclaration.getAbstractDeclarator().accept(this);

        return null;
    }

    @Override
    public Void visit(AbstractDeclaratorPointer abstractDeclaratorPointer) {
        if (abstractDeclaratorPointer.getPointer() != null)
            abstractDeclaratorPointer.getPointer().accept(this);

        return null;
    }

    @Override
    public Void visit(AbstractDeclaratorDirect abstractDeclaratorDirect) {
        if (abstractDeclaratorDirect.getDirect() != null)
            abstractDeclaratorDirect.getDirect().accept(this);

        return null;
    }

    @Override
    public Void visit(AbstractDeclaratorPointerDirect abstractDeclaratorPointerDirect) {
        if (abstractDeclaratorPointerDirect.getPointer() != null)
            abstractDeclaratorPointerDirect.getPointer().accept(this);

        if (abstractDeclaratorPointerDirect.getDirect() != null)
            abstractDeclaratorPointerDirect.getDirect().accept(this);

        return null;
    }

    @Override
    public Void visit(DirectAbstractDeclaratorArray directAbstractDeclaratorArray) {
        if (directAbstractDeclaratorArray.getIndex() != null)
            directAbstractDeclaratorArray.getIndex().accept(this);

        return null;
    }

    @Override
    public Void visit(DirectAbstractDeclaratorParen directAbstractDeclaratorParen) {
        if (directAbstractDeclaratorParen.getParameterList() != null)
            directAbstractDeclaratorParen.getParameterList().accept(this);

        if (directAbstractDeclaratorParen.getAbstractDeclarator() != null)
            directAbstractDeclaratorParen.getAbstractDeclarator().accept(this);

        return null;
    }

    @Override
    public Void visit(DirectAbstractDeclaratorArrayRecursive directAbstractDeclaratorArrayRecursive) {
        if (directAbstractDeclaratorArrayRecursive.getBase() != null)
            directAbstractDeclaratorArrayRecursive.getBase().accept(this);

        if (directAbstractDeclaratorArrayRecursive.getIndex() != null)
            directAbstractDeclaratorArrayRecursive.getIndex().accept(this);

        return null;
    }

    @Override
    public Void visit(DirectAbstractDeclaratorCallRecursive directAbstractDeclaratorCallRecursive) {
        if (directAbstractDeclaratorCallRecursive.getBase() != null)
            directAbstractDeclaratorCallRecursive.getBase().accept(this);

        if (directAbstractDeclaratorCallRecursive.getParameterList() != null)
            directAbstractDeclaratorCallRecursive.getParameterList().accept(this);

        return null;
    }

    @Override
    public Void visit(InitializerListWrapper initializerListWrapper) {
        if (initializerListWrapper.getInitializerList() != null)
            initializerListWrapper.getInitializerList().accept(this);

        return null;
    }

    @Override
    public Void visit(InitializerList initializerList) {
        for (InitializerList.Entry entry : initializerList.getEntries()) {
            if (entry.getDesignation() != null)
                entry.getDesignation().accept(this);

            if (entry.getInitializer() != null)
                entry.getInitializer().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(Designation designation) {
        for (Designator designator : designation.getDesignators()) {
            if (designator != null)
                designator.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ArrayIndexDesignator arrayIndexDesignator) {
        if (arrayIndexDesignator.getIndex() != null)
            arrayIndexDesignator.getIndex().accept(this);

        return null;
    }

    @Override
    public Void visit(FieldDesignator fieldDesignator) {
        return null;
    }

    @Override
    public Void visit(SelectionStatement ss) {
        if (ss.getCondition() != null)
            ss.getCondition().accept(this);

        int thenCount = (ss.getThenStatement() instanceof CompoundStatement)
                ? ((CompoundStatement) ss.getThenStatement()).getBlockItems().size()
                : 1;

        System.out.println("Line " + ss.getLine() + ": Stmt selection = " + thenCount);

        if (ss.getThenStatement() != null)
            ss.getThenStatement().accept(this);

        if (ss.getElseStatement() != null) {
            if (ss.getElseStatement() instanceof SelectionStatement) {
                ss.getElseStatement().accept(this);
            } else {
                int elseCount = (ss.getElseStatement() instanceof CompoundStatement)
                        ? ((CompoundStatement) ss.getElseStatement()).getBlockItems().size()
                        : 1;

                System.out.println("Line " + ss.getElseStatement().getLine() + ": Stmt selection = " + elseCount);
                ss.getElseStatement().accept(this);
            }
        }

        return null;
    }


    @Override
    public Void visit(DoWhileStatement doWhileStatement) {
        int stmtCount = (doWhileStatement.getBody() instanceof CompoundStatement)
                ? ((CompoundStatement) doWhileStatement.getBody()).getBlockItems().size()
                : 1;

        System.out.println("Line " + doWhileStatement.getLine() + ": Stmt while = " + stmtCount);

        if (doWhileStatement.getBody() != null)
            doWhileStatement.getBody().accept(this);

        if (doWhileStatement.getCondition() != null)
            doWhileStatement.getCondition().accept(this);

        return null;
    }

    @Override
    public Void visit(WhileStatement whileStatement) {
        if (whileStatement.getCondition() != null)
            whileStatement.getCondition().accept(this);
        int stmtCount = (whileStatement.getBody() instanceof CompoundStatement)
                ? ((CompoundStatement) whileStatement.getBody()).getBlockItems().size()
                : 1;
        System.out.println("Line " + whileStatement.getLine() + ": Stmt while = " + stmtCount);
        if (whileStatement.getBody() != null)
            whileStatement.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(ForStatement forStatement) {
        if (forStatement.getForCondition() != null)
            forStatement.getForCondition().accept(this);

        int stmtCount = (forStatement.getBody() instanceof CompoundStatement)
                ? ((CompoundStatement) forStatement.getBody()).getBlockItems().size()
                : 1;

        System.out.println("Line " + forStatement.getLine() + ": Stmt for = " + stmtCount);

        if (forStatement.getBody() != null)
            forStatement.getBody().accept(this);

        return null;
    }

    @Override
    public Void visit(ForCondition fc) {
        if (fc.getForDeclaration() != null)
            fc.getForDeclaration().accept(this);

        if (fc.getInitialExpression() != null)
            fc.getInitialExpression().accept(this);

        if (fc.getConditionExpression() != null)
            fc.getConditionExpression().accept(this);

        if (fc.getUpdateExpression() != null)
            fc.getUpdateExpression().accept(this);

        return null;
    }

    @Override
    public Void visit(VoidType voidType) {
        return null;
    }

    @Override
    public Void visit(CharType charType) {
        return null;
    }

    @Override
    public Void visit(ShortType shortType) {
        return null;
    }

    @Override
    public Void visit(IntType intType) {
        return null;
    }

    @Override
    public Void visit(LongType longType) {
        return null;
    }

    @Override
    public Void visit(FloatType floatType) {
        return null;
    }

    @Override
    public Void visit(DoubleType doubleType) {
        return null;
    }

    @Override
    public Void visit(SignedType signedType) {
        return null;
    }

    @Override
    public Void visit(UnsignedType unsignedType) {
        return null;
    }

    @Override
    public Void visit(BoolType boolType) {
        return null;
    }

    @Override
    public Void visit(InitDeclaratorList initDeclaratorList) {
        for (InitDeclarator initDeclarator : initDeclaratorList.getInitDeclarators()) {
            if (initDeclarator != null)
                initDeclarator.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ForDeclaration forDeclaration) {
        if (forDeclaration.getDeclarationSpecifiers() != null)
            forDeclaration.getDeclarationSpecifiers().accept(this);

        if (forDeclaration.getInitDeclaratorList() != null)
            forDeclaration.getInitDeclaratorList().accept(this);

        return null;
    }

    @Override
    public Void visit(ForExpression forExpression) {
        for (Expression expr : forExpression.getExpressions()) {
            if (expr != null)
                expr.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ContinueStatement continueStatement) {
        return null;
    }

    @Override
    public Void visit(BreakStatement breakStatement) {
        return null;
    }

    @Override
    public Void visit(ReturnStatement rs) {
        if (rs.getExpression() != null) {
            rs.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ParameterList parameterList) {
        for (ParameterDeclaration param : parameterList.getParameters()) {
            if (param != null)
                param.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(SizeofTypeExpression sizeofTypeExpression) {
        System.out.println("Line " + sizeofTypeExpression.getLine() + ": Expr sizeof");

        if (sizeofTypeExpression.getTypeName() != null)
            sizeofTypeExpression.getTypeName().accept(this);

        return null;
    }

    @Override
    public Void visit(DirectDeclaratorFunctionParams directDeclaratorFunctionParams) {
        if (directDeclaratorFunctionParams.getBase() != null)
            directDeclaratorFunctionParams.getBase().accept(this);

        if (directDeclaratorFunctionParams.getParameterList() != null)
            directDeclaratorFunctionParams.getParameterList().accept(this);

        return null;
    }

    @Override
    public Void visit(DigitSequenceCast digitSequenceCast) {
        System.out.println("Line " + digitSequenceCast.getLine() + ": Expr " + digitSequenceCast.getValue());
        return null;
    }

    @Override
    public Void visit(UnaryOperatorCastExpression unaryOperatorCastExpression) {
        if (unaryOperatorCastExpression.getUnaryOperator() != null)
            System.out.println("Line " + unaryOperatorCastExpression.getLine() + ": Expr " + unaryOperatorCastExpression.getUnaryOperator().getOperator());

        if (unaryOperatorCastExpression.getCastExpression() != null)
            unaryOperatorCastExpression.getCastExpression().accept(this);

        return null;
    }

    @Override
    public Void visit(TypedCastExpression typedCastExpression) {
        System.out.println("Line " + typedCastExpression.getLine() + ": Expr cast");

        if (typedCastExpression.getType() != null)
            typedCastExpression.getType().accept(this);

        if (typedCastExpression.getInnerCast() != null)
            typedCastExpression.getInnerCast().accept(this);

        return null;
    }

    @Override
    public Void visit(DirectDeclaratorArray directDeclaratorArray) {
        if (directDeclaratorArray.getBase() != null)
            directDeclaratorArray.getBase().accept(this);

        if (directDeclaratorArray.getArrayIndex() != null)
            directDeclaratorArray.getArrayIndex().accept(this);

        return null;
    }

    @Override
    public Void visit(DirectDeclaratorFunctionEmpty directDeclaratorFunctionEmpty) {
        if (directDeclaratorFunctionEmpty.getBase() != null)
            directDeclaratorFunctionEmpty.getBase().accept(this);

        return null;
    }

    @Override
    public Void visit(DirectDeclaratorFunctionIds directDeclaratorFunctionIds) {
        if (directDeclaratorFunctionIds.getBase() != null)
            directDeclaratorFunctionIds.getBase().accept(this);

        if (directDeclaratorFunctionIds.getIdentifierList() != null)
            directDeclaratorFunctionIds.getIdentifierList().accept(this);

        return null;
    }
    @Override
    public Void visit(DirectDeclaratorParen directDeclaratorParen) {
        if (directDeclaratorParen.getDeclarator() != null)
            directDeclaratorParen.getDeclarator().accept(this);

        return null;
    }

    @Override
    public Void visit(Declaration declaration) {
        if (declaration.getDeclarationSpecifiers() != null)
            declaration.getDeclarationSpecifiers().accept(this);

        if (declaration.getInitDeclaratorList() != null)
            declaration.getInitDeclaratorList().accept(this);

        return null;
    }


}
