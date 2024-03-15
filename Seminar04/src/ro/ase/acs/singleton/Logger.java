package ro.ase.acs.singleton;

import java.time.LocalDateTime;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    public synchronized static Logger getInstance(){
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now()+": "+
                message);
    }
}
