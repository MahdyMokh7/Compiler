package main.ast.nodes;

import main.visitor.IVisitor;

public class UnaryOperatorCastExpression extends Expression {
    private CastExpression castExpression;
    private UnaryOperator unaryOperator;

    public UnaryOperatorCastExpression(UnaryOperator u, CastExpression c) {
        this.unaryOperator = u;
        this.castExpression = c;
    }

    public UnaryOperator getUnaryOperator() {
        return unaryOperator;
    }
    public void setUnaryOperator(UnaryOperator unaryOperator) {
        this.unaryOperator = unaryOperator;
    }

    public CastExpression getCastExpression() {
        return castExpression;
    }
    public void setCastExpression(CastExpression castExpression) {
        this.castExpression = castExpression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
