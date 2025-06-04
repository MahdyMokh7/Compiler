package main.ast.nodes;

import main.visitor.IVisitor;

public class AbstractDeclaratorPointer extends AbstractDeclarator {
    private final Pointer pointer;

    public AbstractDeclaratorPointer(Pointer pointer) {
        this.pointer = pointer;
    }

    public Pointer getPointer() {
        return pointer;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
