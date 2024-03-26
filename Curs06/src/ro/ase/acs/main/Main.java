package ro.ase.acs.main;

import ro.ase.acs.builder.Holiday;
import ro.ase.acs.builder.HolidayBuilder;
import ro.ase.acs.builder.HolidayDirector;
import ro.ase.acs.factorymethod.PrivateCarTransferFactory;
import ro.ase.acs.prototype.FemaleCharacter;
import ro.ase.acs.prototype.GameCharacter;
import ro.ase.acs.prototype.MaleCharacter;
import ro.ase.acs.prototype.PrototypeCollection;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FactoryDemo demo = new FactoryDemo(new PrivateCarTransferFactory());
        demo.bookTransfer();

        GameCharacter character1 = new MaleCharacter();
        character1.setName("John");
        character1.setClothesColor("red");
        System.out.println(character1);
        GameCharacter character2 = new FemaleCharacter();
        character2.setName("Maria");
        character2.setClothesColor("green");
        System.out.println(character2);
        GameCharacter character3 = null;
        try {
            character3 = (GameCharacter) character1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        character3.setName("George");
        character3.setClothesColor("black");
        System.out.println(character3);
        GameCharacter character4 = null;
        try {
            character4 = (GameCharacter) character2.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        character4.setName("Elizabeth");
        character4.setClothesColor("gray");
        System.out.println(character4);

        System.out.println("-------------");
        PrototypeCollection prototypes = new PrototypeCollection();
        GameCharacter character5 =
                prototypes.getCharacter(PrototypeCollection.MALE_CHARACTER);
        character5.setClothesColor("yellow");
        GameCharacter character6 =
                prototypes.getCharacter(PrototypeCollection.FEMALE_CHARACTER);
        character6.setClothesColor("blue");
        System.out.println(character5);
        System.out.println(character6);

        HolidayBuilder builder = new HolidayBuilder();
        builder.addHotelName("Hilton").addNoOfPassengers(2).
                addTotalPrice(1000);
        Holiday holiday = builder.build();
        System.out.println(holiday);

        HolidayDirector director = new HolidayDirector();
        Holiday otherHoliday =
                director.createTimeIntervalReservation(
                        LocalDate.now(),
                        LocalDate.now().plusDays(2),
                        3);

        System.out.println(otherHoliday);
    }
}
