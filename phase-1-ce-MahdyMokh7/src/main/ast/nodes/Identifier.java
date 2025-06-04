package main.ast.nodes;

import main.visitor.IVisitor;

public class Identifier extends DirectDeclarator {
    private final String identifier;

    public Identifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return identifier;
    }

    @Override
    public Identifier unwrapToIdentifier() {
        return this;
    }
}
