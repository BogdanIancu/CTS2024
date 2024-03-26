package ro.ase.acs.prototype;

public abstract class GameCharacter implements Cloneable {
    protected String name;
    protected String clothesColor;

    @Override
    public String toString() {
        return "MaleCharacter{" +
                "name='" + name + '\'' +
                ", clothesColor='" + clothesColor + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClothesColor() {
        return clothesColor;
    }

    public void setClothesColor(String clothesColor) {
        this.clothesColor = clothesColor;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        GameCharacter copy = (GameCharacter) super.clone();
        copy.name = name;
        copy.clothesColor = clothesColor;
        return copy;
    }
}
