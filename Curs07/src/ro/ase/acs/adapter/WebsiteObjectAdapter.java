package ro.ase.acs.adapter;

import java.time.LocalDate;

public class WebsiteObjectAdapter extends NewWebsite {
    private AbstractOldWebsite oldWebsite;

    public WebsiteObjectAdapter(AbstractOldWebsite oldWebsite) {
        this.oldWebsite = oldWebsite;
    }

    @Override
    public void searchForHoliday(LocalDate startDate, int noOfNights, int noOfPassengers) {
        oldWebsite.bookHoliday(startDate, startDate.plusDays(noOfNights), noOfPassengers);
    }

    @Override
    public void payOnline() {
        oldWebsite.offlinePayment(totalPrice);
    }
}
