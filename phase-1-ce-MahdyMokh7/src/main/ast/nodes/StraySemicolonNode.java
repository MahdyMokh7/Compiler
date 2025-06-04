package main.ast.nodes;

import main.visitor.IVisitor;

public class StraySemicolonNode extends ExternalDeclaration{
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
