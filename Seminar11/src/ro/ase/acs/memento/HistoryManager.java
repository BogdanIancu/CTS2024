package ro.ase.acs.memento;

import java.util.Stack;

public class HistoryManager {
    private Stack<Video> history = new Stack<>();

    public void saveToHistory(Video video){
        try {
            history.push((Video) video.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Video getFromHistory(){
        return history.pop();
    }
}
