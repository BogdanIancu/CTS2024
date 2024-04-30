package ro.ase.acs.strategy;

import java.util.ArrayList;
import java.util.List;

public class BookingOffer {
    private DiscountStrategy strategy;
    private List<TouristicProduct> products = new ArrayList<>();

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public void addProduct(TouristicProduct product) {
        products.add(product);
    }

    public double getPrice() {
        double totalPrice = 0;
        for(TouristicProduct product : products) {
            totalPrice += product.getPrice();
        }
        double totalDiscount = 0;
        if(strategy != null) {
            totalDiscount = strategy.getDiscount(products);
        }
        return totalPrice - totalDiscount;
    }
}
