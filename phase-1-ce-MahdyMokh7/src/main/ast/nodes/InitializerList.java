package main.ast.nodes;

import main.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class InitializerList extends Node {

    public static class Entry {
        private final Designation designation;
        private final Initializer initializer;

        public Entry(Designation designation, Initializer initializer) {
            this.designation = designation;
            this.initializer = initializer;
        }

        public Designation getDesignation() {
            return designation;
        }

        public Initializer getInitializer() {
            return initializer;
        }
    }

    private final List<Entry> entries = new ArrayList<>();

    public void addEntry(Designation designation, Initializer initializer) {
        entries.add(new Entry(designation, initializer));
    }

    public List<Entry> getEntries() {
        return entries;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
