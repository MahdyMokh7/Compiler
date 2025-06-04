package main.ast.nodes;

import main.visitor.IVisitor;


public class AbstractDeclaratorDirect extends AbstractDeclarator {
    private final DirectAbstractDeclarator direct;

    public AbstractDeclaratorDirect(DirectAbstractDeclarator direct) {
        this.direct = direct;
    }

    public DirectAbstractDeclarator getDirect() {
        return direct;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
