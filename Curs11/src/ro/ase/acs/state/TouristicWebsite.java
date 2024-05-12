package ro.ase.acs.state;

public class TouristicWebsite {
    private OrderState state;

    public void setState(OrderState state) {
        this.state = state;
    }

    public void reserveHoliday() {
        //...
        state = new OrderPlacedState();
        state.sendEmail();
    }

    public void doBookings() {
        state = new OrderInProgressState();
        state.sendEmail();
        //...
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        state = new OrderCompletedState();
        state.sendEmail();
    }
}
