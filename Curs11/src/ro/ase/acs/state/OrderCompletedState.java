package ro.ase.acs.state;

public class OrderCompletedState implements OrderState{

    @Override
    public void sendEmail() {
        System.out.println("Your order is completed. Enjoy your vacation!");
    }
}
