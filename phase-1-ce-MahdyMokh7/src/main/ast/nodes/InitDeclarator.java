package main.ast.nodes;

import main.visitor.IVisitor;

public class InitDeclarator extends Node {
    private Declarator declarator;
    private Initializer initializer; // can be null

    public InitDeclarator(Declarator declarator, Initializer initializer) {
        this.declarator = declarator;
        this.initializer = initializer;
    }

    public Declarator getDeclarator() {
        return declarator;
    }

    public Initializer getInitializer() {
        return initializer;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
