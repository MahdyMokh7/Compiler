package main.ast.nodes;

import main.visitor.IVisitor;

public class Declarator extends Node {
    private Pointer pointer;
    private DirectDeclarator directDeclarator;

    public void setPointer(Pointer pointer) {
        this.pointer = pointer;
    }

    public Pointer getPointer() {
        return pointer;
    }

    public void setDirectDeclarator(DirectDeclarator directDeclarator) {
        this.directDeclarator = directDeclarator;
    }

    public DirectDeclarator getDirectDeclarator() {
        return directDeclarator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
