package main.ast.nodes;

import main.visitor.IVisitor;

public class DirectAbstractDeclaratorCallRecursive extends DirectAbstractDeclarator {
    private final DirectAbstractDeclarator base;
    private final ParameterList parameterList;

    public DirectAbstractDeclaratorCallRecursive(DirectAbstractDeclarator base, ParameterList parameterList) {
        this.base = base;
        this.parameterList = parameterList;
    }

    public DirectAbstractDeclarator getBase() {
        return base;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
