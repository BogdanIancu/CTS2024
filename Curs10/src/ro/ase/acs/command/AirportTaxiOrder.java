package ro.ase.acs.command;

public class AirportTaxiOrder implements TaxiOrder{
    private TaxiDriver taxiDriver;
    private String clientName;

    public AirportTaxiOrder(TaxiDriver taxiDriver, String clientName) {
        this.taxiDriver = taxiDriver;
        this.clientName = clientName;
    }

    @Override
    public void pickUpClient() {
        taxiDriver.driveToPickUpPlace("Arrivals", clientName);
    }
}
