package main.ast.nodes;

import main.visitor.IVisitor;

public class SelectionStatement extends Statement {
    private final Expression condition;
    private final Statement thenStatement;
    private final Statement elseStatement; // may be null

    public SelectionStatement(Expression condition, Statement thenStatement, Statement elseStatement) {
        this.condition = condition;
        this.thenStatement = thenStatement;
        this.elseStatement = elseStatement;
    }

    public Expression getCondition() {
        return condition;
    }

    public Statement getThenStatement() {
        return thenStatement;
    }

    public Statement getElseStatement() {
        return elseStatement;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
