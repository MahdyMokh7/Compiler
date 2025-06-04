package main.ast.nodes;

import main.visitor.IVisitor;

public class UnaryOperator extends Node {
    private String operator;

    public void setOperator(String op) {
        this.operator = op;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return operator;
    }
}
