package main.ast.nodes;

import main.visitor.IVisitor;

public class DirectAbstractDeclaratorArrayRecursive extends DirectAbstractDeclarator {
    private final DirectAbstractDeclarator base;
    private final Expression index;

    public DirectAbstractDeclaratorArrayRecursive(DirectAbstractDeclarator base, Expression index) {
        this.base = base;
        this.index = index;
    }

    public DirectAbstractDeclarator getBase() {
        return base;
    }

    public Expression getIndex() {
        return index;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
