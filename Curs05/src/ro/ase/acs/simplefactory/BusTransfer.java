package ro.ase.acs.simplefactory;

public class BusTransfer implements AirportTransfer{
    BusTransfer() {

    }

    @Override
    public float getPrice() {
        return 10;
    }
}
