package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;
import java.util.List;

public class CommaExpression extends Expression {
    private List<Expression> expressions = new ArrayList<>();

    public void addExpression(Expression expression) {
        expressions.add(expression);
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
