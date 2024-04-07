package ro.ase.acs.adapter;

import java.time.LocalDate;

public class OldWebsite implements AbstractOldWebsite {

    @Override
    public void bookHoliday(LocalDate startDate,
                            LocalDate endDate,
                            int nbOfPassengers) {
        System.out.println("Looking for holidays...");
        System.out.println(startDate + " - " + endDate + " " +
                nbOfPassengers + " people");
    }

    @Override
    public void offlinePayment(double sum) {
        System.out.println("The invoice with the value " +
                sum + " was issued!");
    }
}
