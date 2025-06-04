package main.ast.nodes;

import main.ast.nodes.Node;
import main.visitor.IVisitor;

public abstract class Expression extends CastExpression {
    @Override
    public abstract <T> T accept(IVisitor<T> visitor);
}
