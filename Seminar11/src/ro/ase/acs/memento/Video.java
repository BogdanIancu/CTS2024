package ro.ase.acs.memento;

public class Video implements Cloneable {
    private String name;
    private int length;

    public Video(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Video copy = (Video) super.clone();
        copy.length = length;
        copy.name=name;
        return copy;
    }
}
