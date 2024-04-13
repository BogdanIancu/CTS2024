package ro.ase.acs.proxy;

import java.time.LocalDate;
import java.util.List;

public interface AbstractHotelSearchService {
    List<String> searchHotels(LocalDate startDate,
                              LocalDate endDate,
                              int noOfPassengers);
}
