package ro.ase.acs.main;

import ro.ase.acs.simplefactory.AirportTransfer;
import ro.ase.acs.simplefactory.AirportTransferFactory;
import ro.ase.acs.simplefactory.TransferType;
import ro.ase.acs.singleton.SingletonRegistry;
import ro.ase.acs.singleton.TourismOperationLicense;
import ro.ase.acs.singleton.TourismOperationLicense2;
import ro.ase.acs.singleton.TourismOperationLicense3;

public class Main {
    public static void main(String[] args) {
        TourismOperationLicense license =
                TourismOperationLicense.getInstance();
        license.issueLicense();
        System.out.println(license);

        TourismOperationLicense otherLicense =
                TourismOperationLicense.getInstance();
        System.out.println(license);
        System.out.println(license == otherLicense);

        TourismOperationLicense2 license2 =
                TourismOperationLicense2.instance;
        license2.issueLicense();
        System.out.println(license2);

        TourismOperationLicense3 license3 =
                TourismOperationLicense3.INSTANCE;
        license3.issueLicense();
        System.out.println(license3);

        SingletonRegistry registry = new SingletonRegistry();
        SingletonRegistry.TourismLicense license4 =
                (SingletonRegistry.TourismLicense) registry.getSingleton("license");
        license4.issueLicense();
        System.out.println(license4);

        AirportTransferFactory factory = new AirportTransferFactory();
        AirportTransfer transfer = factory.reserveAirportTransfer(TransferType.CAR);
        System.out.println(transfer.getPrice());
    }
}
