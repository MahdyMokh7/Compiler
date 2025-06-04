package main.ast.nodes;

import main.visitor.IVisitor;

public class FunctionDefinition extends ExternalDeclaration {
    private DeclarationSpecifiers declarationSpecifiers;
    private Declarator declarator;
    private DeclarationList declarationList;
    private CompoundStatement compoundStatement;

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    public void setDeclarationSpecifiers(DeclarationSpecifiers declarationSpecifiers) {
        this.declarationSpecifiers = declarationSpecifiers;
    }
    public void setDeclarator(Declarator declarator) {
        this.declarator = declarator;
    }
    public void setDeclarationList(DeclarationList declarationList) {
        this.declarationList = declarationList;
    }
    public void setCompoundStatement(CompoundStatement compoundStatement) {
        this.compoundStatement = compoundStatement;
    }

    public DeclarationSpecifiers getDeclarationSpecifiers() {
        return declarationSpecifiers;
    }
    public Declarator getDeclarator() {
        return declarator;
    }
    public DeclarationList getDeclarationList() {
        return declarationList;
    }
    public CompoundStatement getCompoundStatement() {
        return compoundStatement;
    }
}
