package main.ast.nodes;

import main.visitor.IVisitor;

public class AssignmentOperator extends Node {
    private String symbol;

    public AssignmentOperator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return symbol;
    }
}
