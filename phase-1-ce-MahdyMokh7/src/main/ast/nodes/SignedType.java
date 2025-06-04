package main.ast.nodes;

import main.visitor.IVisitor;

public class SignedType extends TypeSpecifier {
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "signed";
    }
}
