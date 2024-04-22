package ro.ase.acs.decorator;

import java.time.LocalDate;

public abstract class AbstractHotelRoom {
    protected float price;

    public float getPrice() {
        return price;
    }

    public abstract void book(LocalDate date);
}
