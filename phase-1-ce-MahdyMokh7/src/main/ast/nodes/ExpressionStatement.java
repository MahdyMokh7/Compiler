package main.ast.nodes;

import main.visitor.IVisitor;

public class ExpressionStatement extends Statement {
    private final Expression expression; // may be null

    public ExpressionStatement(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
