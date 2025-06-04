package main.ast.nodes;

import main.visitor.IVisitor;

public class ParameterDeclaration extends Node {
    private final DeclarationSpecifiers specifiers;
    private final Declarator declarator; // may be null
    private final AbstractDeclarator abstractDeclarator; // may be null

    public ParameterDeclaration(DeclarationSpecifiers specifiers, Declarator declarator, AbstractDeclarator abstractDeclarator) {
        this.specifiers = specifiers;
        this.declarator = declarator;
        this.abstractDeclarator = abstractDeclarator;
    }

    public DeclarationSpecifiers getSpecifiers() {
        return specifiers;
    }

    public Declarator getDeclarator() {
        return declarator;
    }

    public AbstractDeclarator getAbstractDeclarator() {
        return abstractDeclarator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
