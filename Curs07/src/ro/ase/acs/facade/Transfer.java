package ro.ase.acs.facade;

import java.time.LocalDate;

public class Transfer {
    private int minDriverRanking;
    private String waitingPlace;

    private LocalDate date;

    //...

    public void bookTransfer() {
        System.out.println("The transfer was booked!");
    }

    public int getMinDriverRanking() {
        return minDriverRanking;
    }

    public void setMinDriverRanking(int minDriverRanking) {
        this.minDriverRanking = minDriverRanking;
    }

    public String getWaitingPlace() {
        return waitingPlace;
    }

    public void setWaitingPlace(String waitingPlace) {
        this.waitingPlace = waitingPlace;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
