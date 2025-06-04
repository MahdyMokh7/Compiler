package main.ast.nodes;

import main.visitor.IVisitor;

public class DirectDeclaratorParen extends DirectDeclarator {
    private final Declarator declarator;

    public DirectDeclaratorParen(Declarator declarator) {
        this.declarator = declarator;
    }

    public Declarator getDeclarator() {
        return declarator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public Identifier unwrapToIdentifier() {
        return declarator.getDirectDeclarator().unwrapToIdentifier();
    }
}
