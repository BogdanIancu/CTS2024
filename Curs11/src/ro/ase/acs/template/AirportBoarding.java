package ro.ase.acs.template;

public class AirportBoarding extends BoardingProcedure {
    @Override
    public void dropLuggage() {
        System.out.println("Luggage dropped at office 21");
    }

    @Override
    public void checkIn() {
        System.out.println("Ticket issued for place 3F");
    }

    @Override
    public void securityCheck() {
        System.out.println("All ok at security");
    }

    @Override
    public void board() {
        System.out.println("Welcome aboard");
    }
}
