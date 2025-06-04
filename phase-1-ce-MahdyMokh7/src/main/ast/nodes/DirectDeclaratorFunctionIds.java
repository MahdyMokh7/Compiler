package main.ast.nodes;

import main.visitor.IVisitor;

public class DirectDeclaratorFunctionIds extends DirectDeclarator {
    private final DirectDeclarator base;
    private final IdentifierList identifierList;

    public DirectDeclaratorFunctionIds(DirectDeclarator base, IdentifierList identifierList) {
        this.base = base;
        this.identifierList = identifierList;
    }

    public DirectDeclarator getBase() {
        return base;
    }

    public IdentifierList getIdentifierList() {
        return identifierList;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    @Override
    public Identifier unwrapToIdentifier() {
        return base.unwrapToIdentifier();
    }
}
