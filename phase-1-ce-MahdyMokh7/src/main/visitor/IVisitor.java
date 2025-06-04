package main.visitor;

import main.ast.nodes.*;


public interface IVisitor<T> {

    T visit(Program program);
    // start of my coding
    T visit(TranslationUnit translationUnit);
    T visit(Declaration declaration);
    T visit(ExternalDeclaration externalDeclaration);
    T visit(FunctionDefinition functionDefinition);
    T visit(StraySemicolonNode straySemicolonNode);
    T visit(CompoundStatement compoundStatement);
    T visit(DeclarationList declarationList);
    T visit(DeclarationSpecifiers declarationSpecifiers);
    T visit(Declarator declarator);
    T visit(Identifier identifier);
    T visit(ExpressionStatement expressionStatement);
    T visit(ConstantExpression constantExpression);
    T visit(StringLiteralExpression stringLiteralExpression);
    T visit(CompoundLiteralExpression compoundLiteralExpression);
    T visit(TypeName typeName);
    T visit(ArrayAccessExpression arrayAccessExpression);
    T visit(FunctionCallExpression functionCallExpression);
    T visit(UnaryPostfixExpression unaryPostfixExpression);
    T visit(UnaryPrefixExpression unaryPrefixExpression);
    T visit(BinaryExpression binaryExpression);
    T visit(ConditionalExpression conditionalExpression);
    T visit(AssignmentExpression assignmentExpression);
    T visit(AssignmentOperator assignmentOperator);
    T visit(CommaExpression commaExpression);
    T visit(ArgumentExpressionList argumentExpressionList);
    T visit(UnaryOperator unaryOperator);
    T visit(TypedCast typedCast);
    T visit(NullExpression nullExpression);
    T visit(InitDeclarator initDeclarator);
    T visit(KeywordSpecifier keywordSpecifier);
    T visit(SpecifierQualifierList specifierQualifierList);
    T visit(Pointer pointer);
    T visit(IdentifierList identifierList);
    T visit(ParameterDeclaration parameterDeclaration);
    T visit(AbstractDeclaratorPointer abstractDeclaratorPointer);
    T visit(AbstractDeclaratorDirect abstractDeclaratorDirect);
    T visit(AbstractDeclaratorPointerDirect abstractDeclaratorPointerDirect);
    T visit(DirectAbstractDeclaratorArray directAbstractDeclaratorArray);
    T visit(DirectAbstractDeclaratorParen directAbstractDeclaratorParen);
    T visit(DirectAbstractDeclaratorArrayRecursive directAbstractDeclaratorArrayRecursive) ;
    T visit(DirectAbstractDeclaratorCallRecursive directAbstractDeclaratorCallRecursive);
    T visit(InitializerListWrapper initializerListWrapper);
    T visit(InitializerList initializerList);
    T visit(Designation designation);
    T visit(ArrayIndexDesignator arrayIndexDesignator);
    T visit(FieldDesignator fieldDesignator);
    T visit(SelectionStatement selectionStatement);
    T visit(DoWhileStatement doWhileStatement);
    T visit(WhileStatement whileStatement) ;
    T visit(ForStatement forStatement) ;
    T visit(ForCondition forCondition);
    T visit(VoidType voidType);
    T visit(CharType charType);
    T visit(ShortType shortType);
    T visit(IntType intType);
    T visit(LongType longType);
    T visit(FloatType floatType);
    T visit(DoubleType doubleType);
    T visit(SignedType signedType);
    T visit(UnsignedType unsignedType);
    T visit(BoolType boolType);
    T visit(InitDeclaratorList initDeclaratorList);
    T visit(ForDeclaration forDeclaration);
    T visit(ForExpression forExpression);
    T visit(ContinueStatement continueStatement);
    T visit(BreakStatement breakStatement);
    T visit(ReturnStatement returnStatement);
    T visit(ParameterList parameterList);
    T visit(SizeofTypeExpression sizeofTypeExpression);
    T visit(DirectDeclaratorFunctionParams directDeclaratorFunctionParams);
    T visit(DirectDeclaratorArray directDeclaratorArray);
    T visit(DirectDeclaratorFunctionIds directDeclaratorFunctionIds);
    T visit(DirectDeclaratorFunctionEmpty directDeclaratorFunctionEmpty);
    T visit(DirectDeclaratorParen directDeclaratorParen);

    T visit(DigitSequenceCast digitSequenceCast);
    T visit(UnaryOperatorCastExpression unaryOperatorCastExpression);
    T visit(TypedCastExpression typedCastExpression);


}
