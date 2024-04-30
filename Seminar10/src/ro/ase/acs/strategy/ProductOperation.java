package ro.ase.acs.strategy;

import java.util.List;

public class ProductOperation implements Operation {
    @Override
    public double doOperation(List<Integer> numbers) {
        double product = 1;
        for (int x : numbers) {
            product *= x;
        }
        return product;
    }

}
