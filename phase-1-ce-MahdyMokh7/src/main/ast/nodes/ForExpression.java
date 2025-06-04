package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;
import java.util.List;

public class ForExpression extends Node {
    private final List<Expression> expressions = new ArrayList<>();

    public void addExpression(Expression expression) {
        this.expressions.add(expression);
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
