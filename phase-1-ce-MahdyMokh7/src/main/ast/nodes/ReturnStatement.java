package main.ast.nodes;

import main.visitor.IVisitor;

public class ReturnStatement extends JumpStatement {
    private final Expression expression; // may be null

    public ReturnStatement(Expression expression) {
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
