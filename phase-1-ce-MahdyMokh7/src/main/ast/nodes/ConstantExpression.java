package main.ast.nodes;

import main.visitor.IVisitor;

public class ConstantExpression extends Expression {
    private String value;

    public ConstantExpression(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
