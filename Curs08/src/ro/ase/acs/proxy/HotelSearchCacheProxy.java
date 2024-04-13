package ro.ase.acs.proxy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class HotelSearchCacheProxy
        implements AbstractHotelSearchService{
    private static final int CACHING_SECONDS = 5;
    private HashMap<SearchCriteria, List<String>> cache = new HashMap<>();
    private LocalDateTime lastSearch = LocalDateTime.MIN;

    private AbstractHotelSearchService searchService;

    public HotelSearchCacheProxy(AbstractHotelSearchService searchService) {
        this.searchService = searchService;
    }

    @Override
    public List<String> searchHotels(LocalDate startDate, LocalDate endDate, int noOfPassengers) {
        SearchCriteria searchCriteria = new SearchCriteria(startDate, endDate, noOfPassengers);
        long timeSpan = ChronoUnit.SECONDS.between(lastSearch, LocalDateTime.now());
        if(cache.containsKey(searchCriteria) && timeSpan < CACHING_SECONDS) {
            return cache.get(searchCriteria);
        } else {
            List<String> result =
                    searchService.searchHotels(startDate, endDate, noOfPassengers);
            cache.put(searchCriteria, result);
            lastSearch = LocalDateTime.now();
            return result;
        }
    }

    public static class SearchCriteria {
        LocalDate startDate;
        LocalDate endDate;
        int noOfPassengers;

        public SearchCriteria() {
        }

        public SearchCriteria(LocalDate startDate, LocalDate endDate, int noOfPassengers) {
            this.startDate = startDate;
            this.endDate = endDate;
            this.noOfPassengers = noOfPassengers;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SearchCriteria that = (SearchCriteria) o;
            return noOfPassengers == that.noOfPassengers && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate);
        }

        @Override
        public int hashCode() {
            return Objects.hash(startDate, endDate, noOfPassengers);
        }
    }
}
