package ro.ase.acs.builder;

import java.time.LocalDate;

public class HolidayDirector {
    private HolidayBuilder holidayBuilder;

    public Holiday createAnonymousReservation(LocalDate startDate,
                                           LocalDate endDate,
                                           String hotelName) {
        holidayBuilder = new HolidayBuilder();
        holidayBuilder.addStartDate(startDate).addEndDate(endDate).
                addHotelName(hotelName);
        return holidayBuilder.build();
    }

    public Holiday createTimeIntervalReservation(LocalDate startDate,
                                              LocalDate endDate,
                                              int noOfPassenger) {
        holidayBuilder = new HolidayBuilder();
        holidayBuilder.addStartDate(startDate).addEndDate(endDate).
                addNoOfPassengers(noOfPassenger);
        return holidayBuilder.build();
    }
}
