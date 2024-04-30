package ro.ase.acs.strategy;

import java.util.List;

public interface DiscountStrategy {
    double getDiscount(List<TouristicProduct> products);
}
