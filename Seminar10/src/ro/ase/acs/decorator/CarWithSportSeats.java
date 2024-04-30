package ro.ase.acs.decorator;

public class CarWithSportSeats extends CarDecorator{
    private String seatProducer;
    public CarWithSportSeats(Vehicle vehicle) {
        super(vehicle);
    }

    public String getSeatProducer() {
        return seatProducer;
    }

    public void setSeatProducer(String seatProducer) {
        this.seatProducer = seatProducer;
    }
}
