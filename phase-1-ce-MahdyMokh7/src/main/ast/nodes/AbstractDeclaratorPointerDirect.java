package main.ast.nodes;

import main.visitor.IVisitor;


public class AbstractDeclaratorPointerDirect extends AbstractDeclarator {
    private final Pointer pointer;
    private final DirectAbstractDeclarator direct;

    public AbstractDeclaratorPointerDirect(Pointer pointer, DirectAbstractDeclarator direct) {
        this.pointer = pointer;
        this.direct = direct;
    }

    public Pointer getPointer() {
        return pointer;
    }

    public DirectAbstractDeclarator getDirect() {
        return direct;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
