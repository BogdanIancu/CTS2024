package ro.ase.acs.chain;

public class CheckInEmployee extends AirportHandler {
    private static final int MAXIMUM_WEIGHT = 10;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private boolean isLuggageAllowed() {
        return weight <= MAXIMUM_WEIGHT;
    }

    @Override
    public void verify() throws Exception {
        if(isLuggageAllowed()) {
            System.out.println("Luggage dropped and boarding pass issued");
            if(nextHandler != null) {
                nextHandler.verify();
            }
        } else {
            throw new Exception("Luggage exceeds maximum weight");
        }
    }
}
