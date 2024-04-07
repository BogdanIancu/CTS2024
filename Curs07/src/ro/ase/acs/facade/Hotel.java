package ro.ase.acs.facade;

import java.time.LocalDate;

public class Hotel {
    private String name;

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    private int ranking;
    private String mealType;
    private boolean isRestaurantAlreadyReserved = false;

    public void bookRoom(String roomType,
                         LocalDate startDate,
                         int noOfNights) {
        System.out.println("Booking room");
    }

    public boolean reserveRestaurant() {
        if(!isRestaurantAlreadyReserved) {
            isRestaurantAlreadyReserved = true;
            return true;
        } else {
            return false;
        }
    }
}
