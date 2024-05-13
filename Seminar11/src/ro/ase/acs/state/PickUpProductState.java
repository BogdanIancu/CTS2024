package ro.ase.acs.state;

public class PickUpProductState implements VendingMachineState{
    @Override
    public void displayMessage() {
        System.out.println("Please pick up your product!");
    }
}
