package main.ast.nodes;

import main.visitor.IVisitor;

public abstract class DeclarationSpecifier extends Expression {
    @Override
    public abstract <T> T accept(IVisitor<T> visitor);
}
