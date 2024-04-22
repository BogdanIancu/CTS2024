package ro.ase.acs.decorator;

import java.time.LocalDate;

public final class HotelRoom extends AbstractHotelRoom {
    private int surface;
    private int ranking;

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public void book(LocalDate date) {
        System.out.println("Room booked for date " + date);
    }
}
