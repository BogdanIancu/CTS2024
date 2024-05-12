package ro.ase.acs.memento;

import java.util.Stack;

public class HistoryManager {
    private Stack<Invoice> history = new Stack<>();

    public void saveState(Invoice invoice) {
        try {
            history.push((Invoice) invoice.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Invoice restoreState() {
        return history.pop();
    }
}
