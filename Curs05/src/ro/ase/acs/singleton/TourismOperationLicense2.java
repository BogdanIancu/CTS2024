package ro.ase.acs.singleton;

import java.time.LocalDate;
import java.util.Random;

public class TourismOperationLicense2 {
    public static final TourismOperationLicense2 instance =
            new TourismOperationLicense2();
    private int licenseNumber;
    private LocalDate issueDate;
    private Random random = new Random();

    private TourismOperationLicense2() {
    }

    public void issueLicense() {
        licenseNumber = random.nextInt(10_000);
        issueDate = LocalDate.now();
    }

    public void revokeLicense() {
        licenseNumber = -1;
        issueDate = null;
    }

    @Override
    public String toString() {
        return "TourismOperationLicense{" +
                "licenseNumber=" + licenseNumber +
                ", issueDate=" + issueDate +
                '}';
    }
}
