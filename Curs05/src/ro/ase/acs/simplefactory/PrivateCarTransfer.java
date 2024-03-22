package ro.ase.acs.simplefactory;

public class PrivateCarTransfer implements AirportTransfer{
    PrivateCarTransfer() {

    }

    @Override
    public float getPrice() {
        return 100;
    }
}
