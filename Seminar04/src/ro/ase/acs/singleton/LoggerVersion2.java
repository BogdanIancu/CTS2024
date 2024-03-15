package ro.ase.acs.singleton;

import java.time.LocalDateTime;

public class LoggerVersion2 {
    public final static LoggerVersion2 instance =
            new LoggerVersion2();
    private LoggerVersion2() {
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now()+": "+
                message);
    }
}
