package ro.ase.acs.command;

import java.util.ArrayList;
import java.util.List;

public class TaxiOrderingKiosk {
    private List<TaxiOrder> orders = new ArrayList<>();

    public void createOrder(TaxiOrder order) {
        orders.add(order);
    }

    public void sendOrdersToTaxis() {
        for(TaxiOrder order : orders) {
            order.pickUpClient();
        }
        orders.clear();
    }
}
