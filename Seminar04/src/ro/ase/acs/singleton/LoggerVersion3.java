package ro.ase.acs.singleton;

import java.time.LocalDateTime;

public enum LoggerVersion3 {
    INSTANCE;

    public void log(String message) {
        System.out.println(LocalDateTime.now()+": "+
                message);
    }
}
