package ro.ase.acs.decorator;

public class HotelRoomWithView extends HotelRoomDecorator{
    private String viewType;

    public HotelRoomWithView(AbstractHotelRoom hotelRoom) {
        super(hotelRoom);
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    @Override
    public float getPrice() {
        return super.getPrice() * 1.1f;
    }
}
