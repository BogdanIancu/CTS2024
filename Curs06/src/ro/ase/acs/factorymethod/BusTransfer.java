package ro.ase.acs.factorymethod;

public class BusTransfer implements AirportTransfer {
    BusTransfer() {

    }

    @Override
    public float getPrice() {
        return 10;
    }
}
