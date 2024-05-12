package ro.ase.acs.state;

public class OrderPlacedState implements OrderState{

    @Override
    public void sendEmail() {
        System.out.println("Your order was placed. Somebody will contact you.");
    }
}
