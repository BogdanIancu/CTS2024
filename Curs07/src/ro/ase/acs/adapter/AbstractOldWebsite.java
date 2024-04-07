package ro.ase.acs.adapter;

import java.time.LocalDate;

public interface AbstractOldWebsite {
    void bookHoliday(LocalDate startDate,
                     LocalDate endDate,
                     int nbOfPassengers);

    void offlinePayment(double sum);
}
