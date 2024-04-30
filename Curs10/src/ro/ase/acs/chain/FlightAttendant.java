package ro.ase.acs.chain;

public class FlightAttendant extends AirportHandler{
    private String seatNumber;

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    private boolean isSeatCorrect() {
        return "3F".equals(seatNumber);
    }

    @Override
    public void verify() throws Exception {
        if(isSeatCorrect()) {
            System.out.println("Seat is correct");
            if(nextHandler != null) {
                nextHandler.verify();
            }
        } else {
            throw new Exception("You need to change seat!");
        }
    }
}
