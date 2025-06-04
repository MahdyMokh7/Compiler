package main.ast.nodes;

import main.visitor.IVisitor;

public abstract class CastExpression extends Initializer {
    @Override
    public abstract <T> T accept(IVisitor<T> visitor);
}
