package ro.ase.acs.main;

import ro.ase.acs.decorator.HotelRoom;
import ro.ase.acs.decorator.HotelRoomWithView;
import ro.ase.acs.decorator.KingSizeHotelRoom;
import ro.ase.acs.flyweight.AbstractLogo;
import ro.ase.acs.flyweight.LogoFlyweightFactory;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LogoFlyweightFactory factory = new LogoFlyweightFactory();
        AbstractLogo myCompanyLogo =
                factory.getLogo("My Company");
        myCompanyLogo.printLogo(1);
        myCompanyLogo.printLogo(2);
        myCompanyLogo.printLogo(3);
        AbstractLogo insuranceCompanyLogo =
                factory.getLogo("Insurance Company");
        insuranceCompanyLogo.printLogo(4);
        insuranceCompanyLogo.printLogo(5);

        HotelRoom hotelRoom = new HotelRoom();
        hotelRoom.setPrice(100);
        KingSizeHotelRoom kingSizeHotelRoom =
                new KingSizeHotelRoom(hotelRoom);
        float price = kingSizeHotelRoom.getPrice();
        System.out.println(price);

        HotelRoomWithView kingSizeRoomWithView =
                new HotelRoomWithView(kingSizeHotelRoom);
        kingSizeRoomWithView.setViewType("Ocean");
        price = kingSizeRoomWithView.getPrice();
        System.out.println(price);
        kingSizeRoomWithView.book(LocalDate.now());
    }
}
