package ro.ase.acs.flyweight;

public class CustomCharacter implements TextCharacter{
    private char character;
    private byte[] image;

    public CustomCharacter(char character, byte[] image) {
        this.character = character;
        this.image = image;
    }

    @Override
    public void display(CharacterPosition position) {
        System.out.println(character + "|" + position.
                getLine() + ":" + position.getColumn());
    }
}
