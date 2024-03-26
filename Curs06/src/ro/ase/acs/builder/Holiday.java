package ro.ase.acs.builder;

import java.time.LocalDate;

public class Holiday {
    private LocalDate startDate;
    private LocalDate endDate;
    private int noOfPassengers;
    private float totalPrice;
    private String hotelName;

    private Holiday() {

    }

    Holiday(LocalDate startDate, LocalDate endDate, int noOfPassengers, float totalPrice, String hotelName) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.noOfPassengers = noOfPassengers;
        this.totalPrice = totalPrice;
        this.hotelName = hotelName;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", noOfPassengers=" + noOfPassengers +
                ", totalPrice=" + totalPrice +
                ", hotelName='" + hotelName + '\'' +
                '}';
    }
}
