package ro.ase.acs.builder;

import java.time.LocalDate;

public class HolidayBuilder {
    private LocalDate startDate;
    private LocalDate endDate;
    private int noOfPassengers;
    private float totalPrice;
    private String hotelName;

    public HolidayBuilder addStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public HolidayBuilder addEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public HolidayBuilder addNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
        return this;
    }

    public HolidayBuilder addTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public HolidayBuilder addHotelName(String hotelName) {
        this.hotelName = hotelName;
        return this;
    }

    public Holiday build() {
        return new Holiday(startDate, endDate, noOfPassengers,
                totalPrice, hotelName);
    }
}
