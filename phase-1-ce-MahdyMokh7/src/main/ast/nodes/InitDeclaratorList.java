package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;
import java.util.List;

public class InitDeclaratorList extends Node {
    private final List<InitDeclarator> initDeclarators = new ArrayList<>();

    public void addInitDeclarator(InitDeclarator initDeclarator) {
        this.initDeclarators.add(initDeclarator);
    }

    public List<InitDeclarator> getInitDeclarators() {
        return initDeclarators;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
