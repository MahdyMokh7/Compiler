package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;
import java.util.List;

public class ArgumentExpressionList extends Node {
    private final List<Expression> expressions = new ArrayList<>();

    public void setFirst(Expression expr) {
        expressions.add(expr);
    }

    public void addRest(Expression expr) {
        expressions.add(expr);
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
