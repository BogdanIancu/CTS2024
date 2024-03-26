package ro.ase.acs.factorymethod;

public class PrivateCarTransfer implements AirportTransfer {
    PrivateCarTransfer() {

    }

    @Override
    public float getPrice() {
        return 100;
    }
}
