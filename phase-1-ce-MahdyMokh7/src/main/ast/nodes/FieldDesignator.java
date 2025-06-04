package main.ast.nodes;

import main.visitor.IVisitor;

public class FieldDesignator extends Designator {
    private final String fieldName;

    public FieldDesignator(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
