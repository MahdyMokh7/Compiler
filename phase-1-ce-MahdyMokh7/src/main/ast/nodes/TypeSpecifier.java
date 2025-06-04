package main.ast.nodes;

import main.visitor.IVisitor;

public abstract class TypeSpecifier extends DeclarationSpecifier {

    @Override
    public abstract  <T> T accept(IVisitor<T> visitor);

}
