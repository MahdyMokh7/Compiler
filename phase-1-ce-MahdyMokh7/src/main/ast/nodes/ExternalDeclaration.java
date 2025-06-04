package main.ast.nodes;

import main.visitor.IVisitor;

public class ExternalDeclaration extends BlockItem{
    public ExternalDeclaration(){}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    // my start of coding




}
