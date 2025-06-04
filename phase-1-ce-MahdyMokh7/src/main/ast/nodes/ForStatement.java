package main.ast.nodes;

import main.visitor.IVisitor;

public class ForStatement extends IterationStatement {
    private final ForCondition forCondition;
    private final Statement body;

    public ForStatement(ForCondition forCondition, Statement body) {
        this.forCondition = forCondition;
        this.body = body;
    }

    public ForCondition getForCondition() {
        return forCondition;
    }

    public Statement getBody() {
        return body;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
