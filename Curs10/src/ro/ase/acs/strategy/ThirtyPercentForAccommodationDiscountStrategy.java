package ro.ase.acs.strategy;

import java.util.List;

public class ThirtyPercentForAccommodationDiscountStrategy implements DiscountStrategy{

    @Override
    public double getDiscount(List<TouristicProduct> products) {
        double totalDiscount = 0;
        for(TouristicProduct product : products) {
            if(product.getCategory() == ProductCategory.ACCOMMODATION) {
                totalDiscount += product.getPrice() * 0.3;
            }
        }
        return totalDiscount;
    }
}
