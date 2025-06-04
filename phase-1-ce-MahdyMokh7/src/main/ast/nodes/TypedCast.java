package main.ast.nodes;

import main.visitor.IVisitor;

public class TypedCast extends Expression {
    private TypeName type;
    private CastExpression castExpression;

    public void setType(TypeName type) {
        this.type = type;
    }

    public TypeName getType() {
        return type;
    }

    public void setCastExpression(CastExpression expression) {
        this.castExpression = expression;
    }

    public CastExpression getCastExpression() {
        return castExpression;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
