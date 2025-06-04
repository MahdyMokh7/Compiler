package main.ast.nodes;

import main.visitor.IVisitor;

public class SizeofTypeExpression extends Expression {
    private TypeName typeName;

    public SizeofTypeExpression(TypeName typeName) {
        this.typeName = typeName;
    }

    public TypeName getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeName typeName) {
        this.typeName = typeName;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
