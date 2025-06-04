package main.ast.nodes;

import main.visitor.IVisitor;

public class ForDeclaration extends Node {
    private final DeclarationSpecifiers declarationSpecifiers;
    private final InitDeclaratorList initDeclaratorList; // may be null

    public ForDeclaration(DeclarationSpecifiers declarationSpecifiers, InitDeclaratorList initDeclaratorList) {
        this.declarationSpecifiers = declarationSpecifiers;
        this.initDeclaratorList = initDeclaratorList;
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
