package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;
import java.util.List;

public class Designation extends Node {
    private final List<Designator> designators = new ArrayList<>();

    public void addDesignator(Designator designator) {
        designators.add(designator);
    }

    public List<Designator> getDesignators() {
        return designators;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
