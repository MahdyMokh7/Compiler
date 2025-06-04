package main.ast.nodes;

import main.visitor.IVisitor;

public class DirectAbstractDeclaratorParen extends DirectAbstractDeclarator {
    private final ParameterList parameterList;
    private final AbstractDeclarator abstractDeclarator;

    public DirectAbstractDeclaratorParen(ParameterList parameterList, AbstractDeclarator abstractDeclarator) {
        this.parameterList = parameterList;
        this.abstractDeclarator = abstractDeclarator;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public AbstractDeclarator getAbstractDeclarator() {
        return abstractDeclarator;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
