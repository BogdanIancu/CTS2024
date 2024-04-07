package ro.ase.acs.main;

import ro.ase.acs.adapter.*;
import ro.ase.acs.facade.TravelAgencyFacade;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AbstractNewWebsite website = new NewWebsite();
        website.searchForHoliday(
                LocalDate.parse("2024-04-01"),
                2, 3);
        website.payOnline();

        AbstractOldWebsite oldWebsite = new OldWebsite();
        WebsiteObjectAdapter objectAdapter = new WebsiteObjectAdapter(oldWebsite);
        objectAdapter.searchForHoliday(
                LocalDate.parse("2024-04-01"),
                2, 3);
        objectAdapter.payOnline();

        WebsiteClassAdapter classAdapter = new WebsiteClassAdapter();
        classAdapter.searchForHoliday(
                LocalDate.parse("2024-04-01"),
                2, 3);
        objectAdapter.payOnline();

        TravelAgencyFacade facade = new TravelAgencyFacade();
        facade.reserveHoliday(LocalDate.parse("2024-04-08"), 5);
    }
}
