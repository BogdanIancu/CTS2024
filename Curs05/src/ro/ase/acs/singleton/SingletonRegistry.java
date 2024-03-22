package ro.ase.acs.singleton;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SingletonRegistry {
    private static Map<String, Object> registry = new HashMap<>();

    static {
        registry.put("license", new TourismLicense());
        registry.put("connection", new DatabaseConnection());
    }

    public Object getSingleton(String key) {
        if(registry.containsKey(key)) {
            return registry.get(key);
        } else {
            throw new RuntimeException("Invalid key");
        }
    }

    public static class DatabaseConnection {
        private DatabaseConnection() {

        }
        //...
    }

    public static class TourismLicense {
        private int licenseNumber;
        private LocalDate issueDate;
        private Random random = new Random();

        private TourismLicense() {
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
}
