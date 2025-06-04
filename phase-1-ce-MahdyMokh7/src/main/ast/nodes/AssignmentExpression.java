package main.ast.nodes;

import main.visitor.IVisitor;

public class AssignmentExpression extends Expression {
    private Expression left;
    private Expression right;
    private AssignmentOperator operator;

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

    public void setOperator(AssignmentOperator operator) {
        this.operator = operator;
    }

    public AssignmentOperator getOperator() {
        return operator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
