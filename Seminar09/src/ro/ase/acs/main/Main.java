package ro.ase.acs.main;

import ro.ase.acs.composite.EmailAddress;
import ro.ase.acs.composite.EmailGroup;
import ro.ase.acs.composite.EmailReceiver;
import ro.ase.acs.flyweight.CharacterPosition;
import ro.ase.acs.flyweight.CustomCharacterFactory;
import ro.ase.acs.flyweight.TextCharacter;

public class Main {
    public static void main(String[] args) {

        EmailReceiver seriesD = new EmailGroup();
        EmailReceiver group1089 = new EmailGroup();
        EmailReceiver group1090 = new EmailGroup();
        EmailReceiver stud1 = new EmailAddress("stud1@csie.ase.ro");
        EmailReceiver stud2 = new EmailAddress("stud2@csie.ase.ro");
        EmailReceiver stud3 = new EmailAddress("stud3@csie.ase.ro");
        EmailReceiver stud4 = new EmailAddress("stud4@csie.ase.ro");
        group1089.addReceiver(stud1);
        group1089.addReceiver(stud2);
        group1090.addReceiver(stud3);
        group1090.addReceiver(stud4);
        seriesD.addReceiver(group1089);
        seriesD.addReceiver(group1090);
        seriesD.receive("Buna");

        CustomCharacterFactory factory = new
                CustomCharacterFactory();
        TextCharacter firstCharacter = factory.
                getCustomCharacter('a');
        firstCharacter.display(new CharacterPosition(
                1, 1));
        TextCharacter secondCharacter = factory.
                getCustomCharacter('n');
        secondCharacter.display(new CharacterPosition(
                1, 2));
        TextCharacter thirdCharacter = factory.
                getCustomCharacter('a');
        thirdCharacter.display(new CharacterPosition(
                1, 3));
    }
}