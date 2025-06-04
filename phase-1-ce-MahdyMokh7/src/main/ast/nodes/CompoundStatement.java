package main.ast.nodes;

import main.visitor.IVisitor;
import java.util.ArrayList;
import java.util.List;

public class CompoundStatement extends Statement {
    private final List<BlockItem> blockItems = new ArrayList<>();

    public void addBlockItem(BlockItem item) {
        blockItems.add(item);
    }

    public List<BlockItem> getBlockItems() {
        return blockItems;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
