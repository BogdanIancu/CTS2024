package ro.ase.acs.state;

public class OrderInProgressState implements OrderState{
    @Override
    public void sendEmail() {
        System.out.println("A consultant was assigned for your order. We'll keep in touch.");
    }
}
