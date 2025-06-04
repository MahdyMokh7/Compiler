package main.ast.nodes;

import main.visitor.IVisitor;

public class TypeName extends Node {
    private final SpecifierQualifierList specifierQualifierList;
    private final AbstractDeclarator abstractDeclarator; // may be null

    public TypeName(SpecifierQualifierList specifierQualifierList, AbstractDeclarator abstractDeclarator) {
        this.specifierQualifierList = specifierQualifierList;
        this.abstractDeclarator = abstractDeclarator;
    }

    public SpecifierQualifierList getSpecifierQualifierList() {
        return specifierQualifierList;
    }

    public AbstractDeclarator getAbstractDeclarator() {
        return abstractDeclarator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
