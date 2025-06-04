package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;
import java.util.List;

public class ParameterList extends Node {
    private final List<ParameterDeclaration> parameters = new ArrayList<>();

    public void addParameter(ParameterDeclaration param) {
        parameters.add(param);
    }

    public List<ParameterDeclaration> getParameters() {
        return parameters;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
