package ro.ase.acs.singletonregistry;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    private static Map<String, Object> registry = new HashMap<>();

    static {
        registry.put(Logger.class.getSimpleName(), new Logger());
        registry.put(DatabaseConnection.class.getSimpleName(),
                new DatabaseConnection());
    }

    public <T> T getSingleton(String className) {
        return (T) registry.get(className);
    }

    public static class Logger {
        private Logger() {}

        public void log(String message) {
            System.out.println(LocalDateTime.now() +
                    ": " + message);
        }
    }

    public static class DatabaseConnection {
        private DatabaseConnection() {}

        public void connect() {
            System.out.println("Connecting to the database...");
        }
    }
}
