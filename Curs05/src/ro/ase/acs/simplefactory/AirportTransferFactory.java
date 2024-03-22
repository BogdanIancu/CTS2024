package ro.ase.acs.simplefactory;

public class AirportTransferFactory {

    public AirportTransfer reserveAirportTransfer(TransferType transferType) {
        if(transferType == TransferType.CAR) {
            return new PrivateCarTransfer();
        } else if(transferType == TransferType.BUS) {
            return new BusTransfer();
        } else {
            throw new RuntimeException("Invalid transfer type");
        }
    }
}
