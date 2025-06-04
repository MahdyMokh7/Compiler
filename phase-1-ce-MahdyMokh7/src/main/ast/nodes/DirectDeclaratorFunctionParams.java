package main.ast.nodes;

import main.visitor.IVisitor;

public class DirectDeclaratorFunctionParams extends DirectDeclarator {
    private final DirectDeclarator base;
    private final ParameterList parameterList;

    public DirectDeclaratorFunctionParams(DirectDeclarator base, ParameterList parameterList) {
        this.base = base;
        this.parameterList = parameterList;
    }

    public DirectDeclarator getBase() {
        return base;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    @Override
    public Identifier unwrapToIdentifier() {
        return base.unwrapToIdentifier();
    }
}
