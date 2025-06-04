package main.ast.nodes;

import main.visitor.IVisitor;

public class TypedCastExpression extends CastExpression {
    private final TypeName type;
    private final CastExpression innerCast;

    public TypedCastExpression(TypeName type, CastExpression innerCast) {
        this.type = type;
        this.innerCast = innerCast;
    }

    public TypeName getType() {
        return type;
    }

    public CastExpression getInnerCast() {
        return innerCast;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
