package ro.ase.acs.factorymethod;

public class PrivateCarTransferFactory
        implements AbstractAirportTransferFactory {

    @Override
    public AirportTransfer reserveAirportTransfer() {
        return new PrivateCarTransfer();
    }
}
