package main.ast.nodes;

import main.visitor.IVisitor;

public class InitializerListWrapper extends Initializer {
    private final InitializerList initializerList;

    public InitializerListWrapper(InitializerList initializerList) {
        this.initializerList = initializerList;
    }

    public InitializerList getInitializerList() {
        return initializerList;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
