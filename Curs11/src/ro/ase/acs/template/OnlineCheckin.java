package ro.ase.acs.template;

public class OnlineCheckin extends BoardingProcedure{
    @Override
    public void dropLuggage() {
        System.out.println("Not necessary. Just a cabin luggage.");
    }

    @Override
    public void checkIn() {
        System.out.println("Online check-in. Seat number: 21B");
    }

    @Override
    public void securityCheck() {
        System.out.println("All ok at security!");
    }

    @Override
    public void board() {
        System.out.println("Welcome!");
    }
}
