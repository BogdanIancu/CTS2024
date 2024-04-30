package ro.ase.acs.main;

import ro.ase.acs.chain.BoardingGateEmployee;
import ro.ase.acs.chain.CheckInEmployee;
import ro.ase.acs.chain.FlightAttendant;
import ro.ase.acs.command.AirportTaxiOrder;
import ro.ase.acs.command.TaxiDriver;
import ro.ase.acs.command.TaxiOrderingKiosk;
import ro.ase.acs.strategy.*;

public class Main {
    public static void main(String[] args) {
        CheckInEmployee checkInEmployee = new CheckInEmployee();
        BoardingGateEmployee boardingGateEmployee = new BoardingGateEmployee();
        FlightAttendant flightAttendant = new FlightAttendant();
        checkInEmployee.setNextHandler(boardingGateEmployee);
        boardingGateEmployee.setNextHandler(flightAttendant);

        checkInEmployee.setWeight(5);
        boardingGateEmployee.setFlightNumber("AB123");
        flightAttendant.setSeatNumber("3F");
        try {
            checkInEmployee.verify();
        } catch (Exception e) {
            e.printStackTrace();
        }

        TaxiDriver driver1 = new TaxiDriver();
        TaxiDriver driver2 = new TaxiDriver();

        TaxiOrderingKiosk kiosk = new TaxiOrderingKiosk();
        kiosk.createOrder(new AirportTaxiOrder(driver1, "Ionel"));
        kiosk.createOrder(new AirportTaxiOrder(driver2, "Georgel"));
        kiosk.sendOrdersToTaxis();

        TouristicProduct accommodation =
                new TouristicProduct(ProductCategory.ACCOMMODATION, 300);
        TouristicProduct flight =
                new TouristicProduct(ProductCategory.TRANSPORT, 100);
        TouristicProduct extraTrip =
                new TouristicProduct(ProductCategory.EXTRA_SERVICES, 50);

        BookingOffer offer = new BookingOffer();
        offer.addProduct(accommodation);
        offer.addProduct(flight);
        offer.addProduct(extraTrip);
        offer.setStrategy(new TenPercentDiscountStrategy());
        offer.setStrategy(new ThirtyPercentForAccommodationDiscountStrategy());

        offer.setStrategy(list -> {
            double totalTransportPrice = list.stream().
                    filter(p -> p.getCategory() == ProductCategory.TRANSPORT).
                    mapToDouble(p -> p.getPrice()).sum();
            return totalTransportPrice * 0.5;
        });
        double price = offer.getPrice();
        System.out.println(price);
    }
}
