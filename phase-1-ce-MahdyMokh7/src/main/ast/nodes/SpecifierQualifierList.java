package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;
import java.util.List;

public class SpecifierQualifierList extends Node {
    private final List<Node> specifiers = new ArrayList<>();

    public void addSpecifier(Node specifier) {
        specifiers.add(specifier);
    }

    public void addAll(SpecifierQualifierList other) {
        if (other != null)
            specifiers.addAll(other.getSpecifiers());
    }

    public List<Node> getSpecifiers() {
        return specifiers;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
