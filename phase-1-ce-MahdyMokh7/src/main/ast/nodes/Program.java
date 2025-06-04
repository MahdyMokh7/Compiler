package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;

public class Program extends Node{
    public Program(){}
    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
    // my start of coding
    private TranslationUnit translationUnit;
    public void setTranslationUnit(TranslationUnit translationUnit) {
        this.translationUnit = translationUnit;
    }

    public TranslationUnit getTranslationUnit() {
        return translationUnit;
    }





}
