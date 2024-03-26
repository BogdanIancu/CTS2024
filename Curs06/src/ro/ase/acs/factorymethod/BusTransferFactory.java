package ro.ase.acs.factorymethod;

public class BusTransferFactory
        implements AbstractAirportTransferFactory{
    @Override
    public AirportTransfer reserveAirportTransfer() {
        return new BusTransfer();
    }
}
