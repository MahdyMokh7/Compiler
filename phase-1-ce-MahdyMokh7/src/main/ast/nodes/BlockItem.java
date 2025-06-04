package main.ast.nodes;

import main.visitor.IVisitor;

public abstract class BlockItem extends Node {
    @Override
    public abstract <T> T accept(IVisitor<T> visitor);
}
