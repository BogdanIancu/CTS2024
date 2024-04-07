package ro.ase.acs.adapter;

import java.time.LocalDate;

public interface AbstractNewWebsite {
    void searchForHoliday(LocalDate startDate,
                          int noOfNights,
                          int noOfPassengers);

    void payOnline();
}
