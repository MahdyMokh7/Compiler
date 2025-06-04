package main.ast.nodes;

import main.visitor.IVisitor;

public class DirectDeclaratorArray extends DirectDeclarator {
    private final DirectDeclarator base;
    private final Expression arrayIndex;

    public DirectDeclaratorArray(DirectDeclarator base, Expression arrayIndex) {
        this.base = base;
        this.arrayIndex = arrayIndex;
    }

    public DirectDeclarator getBase() {
        return base;
    }

    public Expression getArrayIndex() {
        return arrayIndex;
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
