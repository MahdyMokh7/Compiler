package main.ast.nodes;

import main.visitor.IVisitor;

public class KeywordSpecifier extends DeclarationSpecifier {
    private final String keyword;

    public KeywordSpecifier(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
