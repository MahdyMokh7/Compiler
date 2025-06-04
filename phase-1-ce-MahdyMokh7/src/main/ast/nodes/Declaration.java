package main.ast.nodes;

import main.visitor.IVisitor;

public class Declaration extends ExternalDeclaration {
    private DeclarationSpecifiers declarationSpecifiers;
    private InitDeclaratorList initDeclaratorList; // or List<InitDeclarator> depending on your design

    public Declaration(DeclarationSpecifiers specifiers, InitDeclaratorList initList) {
        this.declarationSpecifiers = specifiers;
        this.initDeclaratorList = initList;
    }

    public DeclarationSpecifiers getDeclarationSpecifiers() {
        return declarationSpecifiers;
    }

    public InitDeclaratorList getInitDeclaratorList() {
        return initDeclaratorList;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
