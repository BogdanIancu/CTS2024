package ro.ase.acs.prototype;

public class MaleCharacter extends GameCharacter {
    private Image image;

    public MaleCharacter() {
        System.out.println("Loading...");
        image = new Image();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        MaleCharacter copy = (MaleCharacter) super.clone();
        copy.image = (Image) image.clone();
        return copy;
    }
}
