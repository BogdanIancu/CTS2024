package ro.ase.acs.facade;

import java.time.LocalDate;

public class Transport {
    private String flightMealType;
    private String flightType;
    private LocalDate date;

    public String getFlightMealType() {
        return flightMealType;
    }

    public void setFlightMealType(String flightMealType) {
        this.flightMealType = flightMealType;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    //...

    public void reservePrivatePlane() {
        System.out.println("Private plane reservation complete");
    }

    public void reserveRegularFlight() {
        System.out.println("Ticket bought successfully");
    }

    public void rentCar() {
        System.out.println("Car rented");
    }

    //...
}
