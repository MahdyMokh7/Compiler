package main.ast.nodes;

import main.visitor.IVisitor;

public class DigitSequenceCast extends CastExpression {
    private final String value;

    public DigitSequenceCast(String value) {
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
