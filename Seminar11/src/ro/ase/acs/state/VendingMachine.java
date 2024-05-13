package ro.ase.acs.state;

public class VendingMachine {
    private VendingMachineState state;
    private double balance;

    public VendingMachine() {
        state = new InputMoneyState();
        state.displayMessage();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void insertMoney(double sum) {
        balance += sum;
        state = new SelectProductState();
        state.displayMessage();
    }

    public void selectProduct(double price) {
        if (price <= balance) {
            state = new PickUpProductState();
            state.displayMessage();
            if (price < balance) {
                state = new ReturnChangeState();
                state.displayMessage();
            }
            balance = 0;
        } else {
            state = new InputMoneyState();
            state.displayMessage();
        }
    }

}
