package ro.ase.acs.chain;

public class BoardingGateEmployee extends AirportHandler{
    private String flightNumber;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    private boolean isBoardingPassValid() {
        return "AB123".equals(flightNumber);
    }

    @Override
    public void verify() throws Exception {
        if(isBoardingPassValid()) {
            System.out.println("Boarding accepted");
            if(nextHandler != null) {
                nextHandler.verify();
            }
        } else {
            throw new Exception("No valid boarding pass");
        }
    }
}
