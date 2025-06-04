package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class StringLiteralExpression extends Expression {
    private List<String> parts = new ArrayList<>();
    private StringBuilder valueBuilder = new StringBuilder();

    public void addPart(String rawLiteral) {
        // Safely strip the actual string content between the first and last quotation marks
        int start = rawLiteral.indexOf('"');
        int end = rawLiteral.lastIndexOf('"');

        if (start >= 0 && end > start) {
            String content = rawLiteral.substring(start + 1, end);
            parts.add(content);
            valueBuilder.append(content);
        } else {
            parts.add(""); // fallback
        }
    }

    public List<String> getParts() {
        return parts;
    }

    public String getValue() {
        return valueBuilder.toString();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
