package ro.ase.acs.main;

import ro.ase.acs.composite.*;
import ro.ase.acs.proxy.AbstractHotelSearchService;
import ro.ase.acs.proxy.HotelSearchCacheProxy;
import ro.ase.acs.proxy.HotelSearchService;

import javax.naming.OperationNotSupportedException;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AbstractHotelSearchService searchService =
                new HotelSearchCacheProxy(new HotelSearchService());

        List<String> result = searchService.searchHotels(
                LocalDate.now(),
                LocalDate.now().plusDays(2),
                2);
        System.out.println(result);

        result = searchService.searchHotels(
                LocalDate.now(),
                LocalDate.now().plusDays(2),
                2);
        System.out.println(result);

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        result = searchService.searchHotels(
                LocalDate.now(),
                LocalDate.now().plusDays(2),
                2);
        System.out.println(result);

        AbstractTouristicPackage touristicPackage =
                new TouristicPackageComposite();
        AbstractTouristicPackage accommodation =
                new Accommodation();
        try {
            touristicPackage.addComponent(accommodation);
        } catch (OperationNotSupportedException e) {
            throw new RuntimeException(e);
        }

        AbstractTouristicPackage subPackage =
                new TouristicPackageComposite();
        AbstractTouristicPackage transport = new Transport();
        try {
            subPackage.addComponent(transport);
        } catch (OperationNotSupportedException e) {
            throw new RuntimeException(e);
        }
        AbstractTouristicPackage meal = new Meal();
        try {
            subPackage.addComponent(meal);
        } catch (OperationNotSupportedException e) {
            throw new RuntimeException(e);
        }

        try {
            touristicPackage.addComponent(subPackage);
        } catch (OperationNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(touristicPackage.getPrice());
    }
}
