package main.ast.nodes;

import main.visitor.IVisitor;

public class NullExpression extends Expression {

    public NullExpression() {
        // No fields; represents an intentional null-like value
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "null";
    }
}
