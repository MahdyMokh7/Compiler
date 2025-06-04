package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;
import java.util.List;

public class IdentifierList extends Node {
    private final List<String> identifiers = new ArrayList<>();

    public void addIdentifier(String id) {
        identifiers.add(id);
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
