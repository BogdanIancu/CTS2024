package ro.ase.acs.adapter;

import java.time.LocalDate;

public class NewWebsite implements AbstractNewWebsite {
    protected double totalPrice = 1000;

    @Override
    public void searchForHoliday(LocalDate startDate,
                                 int noOfNights,
                                 int noOfPassengers) {
        System.out.println("From: " + startDate);
        System.out.println("Nights: " + noOfNights);
        System.out.println("Passengers: " + noOfPassengers);
        System.out.print("Loading");
        try {
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.println(".");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void payOnline() {
        System.out.println("Please proceed to pay " + totalPrice);
    }
}
