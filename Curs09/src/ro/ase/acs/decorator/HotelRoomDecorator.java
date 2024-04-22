package ro.ase.acs.decorator;

import java.time.LocalDate;

public abstract class HotelRoomDecorator extends AbstractHotelRoom {
    private AbstractHotelRoom hotelRoom;

    public HotelRoomDecorator(AbstractHotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    @Override
    public void book(LocalDate date) {
        hotelRoom.book(date);
    }

    @Override
    public float getPrice() {
        return hotelRoom.getPrice();
    }
}
