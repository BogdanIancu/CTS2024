package ro.ase.acs.state;

public class InputMoneyState implements VendingMachineState{
    @Override
    public void displayMessage() {
        System.out.println("Please input money...");
    }
}
