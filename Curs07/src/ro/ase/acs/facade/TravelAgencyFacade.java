package ro.ase.acs.facade;

import java.time.LocalDate;

public class TravelAgencyFacade {
    private Hotel hotel = new Hotel();
    private Transport transport = new Transport();
    private Transfer transfer = new Transfer();

    public void reserveHoliday(LocalDate startDate, int noOfNights) {
        hotel.setRanking(4);
        hotel.bookRoom("Double", startDate, noOfNights);
        transport.setFlightType("Economic");
        transport.setDate(startDate);
        transport.reserveRegularFlight();

        transport.setDate(startDate.plusDays(noOfNights));
        transport.reserveRegularFlight();

        transfer.setMinDriverRanking(3);
        transfer.setWaitingPlace("airport lobby");
        transfer.setDate(startDate);
        transfer.bookTransfer();

        transfer.setDate(startDate.plusDays(noOfNights));
        transfer.bookTransfer();
    }
}
