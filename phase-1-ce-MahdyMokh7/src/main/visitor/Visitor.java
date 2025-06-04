package main.visitor;

import main.ast.nodes.*;

/*GOALs:
*   1. print out scope changes each time a new scope starts
*   2. print the identifier if it is initialized
*   3. print the identifier if it is used
*   4. print out the name of the function when it is defined
*   5. print out the name of the function when it is used
*
* */

public abstract class Visitor<T> implements IVisitor<T> {
    @Override
    public T visit(Program program) {
        return null;
    }
    // my start of coding
    @Override
    public T visit(TranslationUnit translationUnit) { return null; }
    @Override
    public T visit(ExternalDeclaration externalDeclaration) { return null; }
    @Override
    public T visit(Declaration declaration) {return null;}
    @Override
    public T visit(FunctionDefinition functionDefinition) {return null;}
    @Override
    public T visit(StraySemicolonNode straySemicolonNode) {return null;}
    @Override
    public T visit(CompoundStatement compoundStatement) { return null; }
    @Override
    public T visit(DeclarationList declarationList) {return null;}
    @Override
    public T visit(DeclarationSpecifiers declarationSpecifiers) {return null;}
    @Override
    public T visit(Declarator declarator) {return null;}
    @Override
    public T visit(Identifier identifier) {return null;}
    @Override
    public T visit(ConstantExpression constantExpression) {return null;}
    @Override
    public T visit(StringLiteralExpression stringLiteralExpression) {return null;}
    @Override
    public T visit(CompoundLiteralExpression compoundLiteralExpression) {return null;}
    @Override
    public T visit(TypeName typeName) {return null;}
    @Override
    public T visit(ArrayAccessExpression arrayAccessExpression) {return null;}
    @Override
    public T visit(FunctionCallExpression functionCallExpression) {return null;}
    @Override
    public T visit(UnaryPostfixExpression unaryPostfixExpression) {return null;}
    @Override
    public T visit(UnaryPrefixExpression unaryPrefixExpression) {return null;}
    @Override
    public T visit(BinaryExpression binaryExpression) {return null;}
    @Override
    public T visit(ConditionalExpression conditionalExpression) {return null;}
    @Override
    public T visit(AssignmentExpression assignmentExpression) {return null;}
    @Override
    public T visit(AssignmentOperator assignmentOperator) {return null;}
    @Override
    public T visit(CommaExpression commaExpression) {return null;}
    @Override
    public T visit(ArgumentExpressionList argumentExpressionList) {return null;}
    @Override
    public T visit(UnaryOperator unaryOperator) {return null;}
    @Override
    public T visit(TypedCast typedCast) {return null;}
    @Override
    public T visit(NullExpression nullExpression) {return null;}
    @Override
    public T visit(InitDeclarator initDeclarator) {return null;}
    @Override
    public T visit(KeywordSpecifier keywordSpecifier) {return null;}
    @Override
    public T visit(SpecifierQualifierList specifierQualifierList) {return null;}
    @Override
    public T visit(Pointer pointer) {return null;}
    @Override
    public T visit(IdentifierList identifierList) {return null;}
    @Override
    public T visit(ParameterDeclaration parameterDeclaration) {return null;}
    @Override
    public T visit(AbstractDeclaratorPointer abstractDeclaratorPointer){return null;}
    @Override
    public T visit(AbstractDeclaratorDirect abstractDeclaratorDirect){return null;}
    @Override
    public T visit(AbstractDeclaratorPointerDirect abstractDeclaratorPointerDirect){return null;}
    @Override
    public T visit(DirectAbstractDeclaratorArray directAbstractDeclaratorArray) {
        return null;
    }
    @Override
    public T visit(DirectAbstractDeclaratorParen directAbstractDeclaratorParen) {
        return null;
    }
    @Override
    public T visit(DirectAbstractDeclaratorArrayRecursive directAbstractDeclaratorArrayRecursive) {
        return null;
    }
    @Override
    public T visit(DirectAbstractDeclaratorCallRecursive directAbstractDeclaratorCallRecursive) {
        return null;
    }
    @Override
    public T visit(InitializerListWrapper initializerListWrapper) {return null;}
    @Override
    public T visit(InitializerList initializerList) {return null;}
    @Override
    public T visit(Designation designation) {return null;}
    @Override
    public T visit(ArrayIndexDesignator arrayIndexDesignator) {return null;}
    @Override
    public T visit(FieldDesignator fieldDesignator) {return null;}
    @Override
    public T visit(ExpressionStatement expressionStatement) {return null;}
    @Override
    public T visit(SelectionStatement selectionStatement) {return null;}
    @Override
    public T visit(DoWhileStatement doWhileStatement) {return null;}
    @Override
    public T visit(WhileStatement whileStatement) {return null;}
    @Override
    public T visit(ForStatement forStatement) {return null;}
    @Override
    public T visit(ForCondition forCondition) {return null;}
    @Override
    public T visit(VoidType voidType) { return null; }
    @Override
    public T visit(CharType charType) { return null; }
    @Override
    public T visit(ShortType shortType) { return null; }
    @Override
    public T visit(IntType intType) { return null; }
    @Override
    public T visit(LongType longType) { return null; }
    @Override
    public T visit(FloatType floatType) { return null; }
    @Override
    public T visit(DoubleType doubleType) { return null; }
    @Override
    public T visit(SignedType signedType) { return null; }
    @Override
    public T visit(UnsignedType unsignedType) { return null; }
    @Override
    public T visit(BoolType boolType) { return null; }
    @Override
    public T visit(InitDeclaratorList initDeclaratorList) { return null; }
    @Override
    public T visit(ForDeclaration forDeclaration) { return null; }
    @Override
    public T visit(ForExpression forExpression) { return null; }
    @Override
    public T visit(ContinueStatement continueStatement) { return null; }
    @Override
    public T visit(BreakStatement breakStatement) { return null; }
    @Override
    public T visit(ReturnStatement returnStatement) { return null; }
    @Override
    public T visit(ParameterList parameterList) { return null; }
    @Override
    public T visit(SizeofTypeExpression sizeofTypeExpression){return null;}
    @Override
    public T visit(DirectDeclaratorFunctionParams directDeclaratorFunctionParams){return null;}
    @Override
    public T visit(DigitSequenceCast digitSequenceCast){return null;}
    @Override
    public T visit(UnaryOperatorCastExpression unaryOperatorCastExpression){return null;}
    @Override
    public T visit(TypedCastExpression typedCastExpression){return null;}
    @Override
    public T visit(DirectDeclaratorArray directDeclaratorArray) {return null;}
    @Override
    public T visit(DirectDeclaratorFunctionIds directDeclaratorFunctionIds){return null;}
    @Override
    public T visit(DirectDeclaratorFunctionEmpty directDeclaratorFunctionEmpty) {return null;}
    @Override
    public T visit(DirectDeclaratorParen directDeclaratorParen) {return null;}

}
