package ro.ase.acs.memento;

public class VideoEditor {
    private Video video;
    private HistoryManager historyManager;

    public VideoEditor() {
        video = new Video("Untitled",0);
        historyManager = new HistoryManager();
    }

    public void edit(int newLength){
        video.setLength(video.getLength() + newLength);
    }

    public void save(){
        historyManager.saveToHistory(video);
    }

    public void undo(){
        video = historyManager.getFromHistory();
    }

    @Override
    public String toString() {
        return video.getName() + ": " + video.getLength() + " min";
    }
}
