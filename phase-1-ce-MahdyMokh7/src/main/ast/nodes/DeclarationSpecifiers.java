package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;
import java.util.List;

public class DeclarationSpecifiers extends Node {
    private final List<DeclarationSpecifier> specifiers = new ArrayList<>();

    public void addSpecifier(DeclarationSpecifier spec) {
        specifiers.add(spec);
    }

    public List<DeclarationSpecifier> getSpecifiers() {
        return specifiers;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
