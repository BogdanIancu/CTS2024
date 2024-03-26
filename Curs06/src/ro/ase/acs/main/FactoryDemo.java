package ro.ase.acs.main;

import ro.ase.acs.factorymethod.AbstractAirportTransferFactory;
import ro.ase.acs.factorymethod.AirportTransfer;

public class FactoryDemo {
    private AbstractAirportTransferFactory factory;

    public FactoryDemo(AbstractAirportTransferFactory factory) {
        this.factory = factory;
    }

    public void bookTransfer() {
        AirportTransfer transfer = factory.reserveAirportTransfer();
        System.out.println("You successfully booked the transfer. Price: " +
                transfer.getPrice());
    }
}
