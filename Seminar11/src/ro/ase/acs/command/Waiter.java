package ro.ase.acs.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<FoodOrder> orders = new ArrayList<>();

    public void addOrder(FoodOrder order) {
        orders.add(order);
    }

    public void sendOrdersToKitchen() {
        for (FoodOrder o: orders) {
            o.prepare();
        }
        orders.clear();
    }
}
