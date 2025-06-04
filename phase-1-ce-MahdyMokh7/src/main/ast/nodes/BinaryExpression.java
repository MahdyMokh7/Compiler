package main.ast.nodes;

import main.visitor.IVisitor;

public class BinaryExpression extends Expression {
    private Expression left;
    private Expression right;
    private String operator;

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getLeft() {
        return left;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public Expression getRight() {
        return right;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
