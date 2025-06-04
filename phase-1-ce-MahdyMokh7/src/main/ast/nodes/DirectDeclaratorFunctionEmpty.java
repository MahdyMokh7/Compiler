package main.ast.nodes;

import main.visitor.IVisitor;

public class DirectDeclaratorFunctionEmpty extends DirectDeclarator {
    private final DirectDeclarator base;

    public DirectDeclaratorFunctionEmpty(DirectDeclarator base) {
        this.base = base;
    }

    public DirectDeclarator getBase() {
        return base;
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
