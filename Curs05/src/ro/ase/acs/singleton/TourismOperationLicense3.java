package ro.ase.acs.singleton;

import java.time.LocalDate;
import java.util.Random;

public enum TourismOperationLicense3 {
    INSTANCE;
    private int licenseNumber;
    private LocalDate issueDate;
    private Random random = new Random();

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
