package ro.ase.acs.decorator;

public class KingSizeHotelRoom extends HotelRoomDecorator{
    private int bedSize = 200;

    public KingSizeHotelRoom(AbstractHotelRoom hotelRoom) {
        super(hotelRoom);
    }

    public int getBedSize() {
        return bedSize;
    }

    @Override
    public float getPrice() {
        return super.getPrice() * 1.2f;
    }

}
