package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;
import java.util.List;

public class TranslationUnit extends Node{
    private List<ExternalDeclaration> externalDeclarations = new ArrayList<>();


    public TranslationUnit(){}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public void addExternalDeclaration(ExternalDeclaration ed) {
        externalDeclarations.add(ed);
    }

    public List<ExternalDeclaration> getExternalDeclarations() {
        return externalDeclarations;
    }

}
