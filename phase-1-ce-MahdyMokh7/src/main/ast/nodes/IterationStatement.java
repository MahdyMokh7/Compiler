package main.ast.nodes;

import main.visitor.IVisitor;

public abstract class IterationStatement extends Statement {
    @Override
    public abstract <T> T accept(IVisitor<T> visitor);
}
