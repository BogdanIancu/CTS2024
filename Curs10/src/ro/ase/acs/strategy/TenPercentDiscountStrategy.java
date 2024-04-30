package ro.ase.acs.strategy;

import java.util.ArrayList;
import java.util.List;

public class TenPercentDiscountStrategy implements DiscountStrategy{
    @Override
    public double getDiscount(List<TouristicProduct> products) {
        double totalDiscount = 0;
        for(TouristicProduct product : products) {
            totalDiscount += product.getPrice() * 0.1;
        }
        return totalDiscount;
    }
}
