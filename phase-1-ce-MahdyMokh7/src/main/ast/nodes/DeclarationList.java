package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;
import java.util.List;

public class DeclarationList extends Node {
    private List<Declaration> declarations = new ArrayList<>() ;

    public List<Declaration> getDeclarations() {
        return declarations;
    }

    public void addDeclaration(Declaration declaration) {
        declarations.add(declaration);
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
