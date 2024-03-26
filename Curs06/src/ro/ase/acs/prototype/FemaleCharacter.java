package ro.ase.acs.prototype;

public class FemaleCharacter extends GameCharacter {
    private Image image;

    public FemaleCharacter() {
        System.out.println("Loading...");
        image = new Image();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        FemaleCharacter copy = (FemaleCharacter) super.clone();
        copy.image = (Image) image.clone();
        return copy;
    }
}
