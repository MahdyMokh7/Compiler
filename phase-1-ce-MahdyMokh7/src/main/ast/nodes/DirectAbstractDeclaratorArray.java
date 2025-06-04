package main.ast.nodes;

import main.visitor.IVisitor;

public class DirectAbstractDeclaratorArray extends DirectAbstractDeclarator {
    private final Expression index;

    public DirectAbstractDeclaratorArray(Expression index) {
        this.index = index;
    }

    public Expression getIndex() {
        return index;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
