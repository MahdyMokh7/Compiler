package main.ast.nodes;

import main.visitor.IVisitor;

public abstract class Statement extends BlockItem {
    @Override
    public abstract <T> T accept(IVisitor<T> visitor);
}
