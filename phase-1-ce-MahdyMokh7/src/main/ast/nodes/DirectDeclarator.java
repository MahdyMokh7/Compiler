package main.ast.nodes;

import main.visitor.IVisitor;

public abstract class DirectDeclarator extends TypeSpecifier {

    // Abstract accept method
    @Override
    public abstract <T> T accept(IVisitor<T> visitor);

    // Abstract unwrap method to resolve down to DirectDeclaratorIdentifier
    public abstract Identifier unwrapToIdentifier();
}
