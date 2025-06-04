package main.ast.nodes;

import main.visitor.IVisitor;

public class CompoundLiteralExpression extends Expression {
    private TypeName type;
    private InitializerList initializerList;

    public CompoundLiteralExpression(TypeName type, InitializerList initializerList) {
        this.type = type;
        this.initializerList = initializerList;
    }

    public TypeName getType() {
        return type;
    }

    public InitializerList getInitializerList() {
        return initializerList;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
