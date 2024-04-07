package ro.ase.acs.adapter;

import java.time.LocalDate;

public class WebsiteClassAdapter extends OldWebsite
        implements AbstractNewWebsite {
    @Override
    public void searchForHoliday(LocalDate startDate, int noOfNights, int noOfPassengers) {
        this.bookHoliday(startDate,
                startDate.plusDays(noOfNights), noOfPassengers);
    }

    @Override
    public void payOnline() {
        this.offlinePayment(1000);
    }
}
