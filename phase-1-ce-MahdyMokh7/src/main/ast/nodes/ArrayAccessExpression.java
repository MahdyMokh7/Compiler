package main.ast.nodes;

import main.visitor.IVisitor;

public class ArrayAccessExpression extends Expression {
    private Expression array;
    private Expression index;

    public ArrayAccessExpression(Expression array, Expression index) {
        this.array = array;
        this.index = index;
    }

    public Expression getArray() {
        return array;
    }

    public void setArray(Expression array) {
        this.array = array;
    }

    public Expression getIndex() {
        return index;
    }

    public void setIndex(Expression index) {
        this.index = index;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
