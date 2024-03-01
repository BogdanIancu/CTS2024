package ro.ase.acs.solid.classes;

import ro.ase.acs.solid.interfaces.Computable;

import java.util.List;

public class ProductCalculator implements Computable {
    @Override
    public long computeResult(List<Integer> list) {
        long product = 1;
        for(int i : list) {
            product *= i;
        }
        return product;
    }
}
