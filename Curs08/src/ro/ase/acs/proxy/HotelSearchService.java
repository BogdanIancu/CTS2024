package ro.ase.acs.proxy;

import java.time.LocalDate;
import java.util.List;

public class HotelSearchService implements AbstractHotelSearchService {
    //...

    @Override
    public List<String> searchHotels(LocalDate startDate,
                                     LocalDate endDate,
                                     int noOfPassengers) {
        System.out.println("Searching hotel for " +
                startDate + " - " + endDate + " " +
                noOfPassengers + " person(s)");
        return List.of("Intercontinental", "Athenee Palace",
                "Marriott", "Hilton");
    }
}
