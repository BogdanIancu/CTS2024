package ro.ase.acs.solid.classes;

import ro.ase.acs.solid.exceptions.InvalidListException;
import ro.ase.acs.solid.interfaces.Computable;

import java.util.List;

public class ProductCalculator implements Computable {
    @Override
    public long computeResult(List<Integer> list) throws InvalidListException {
        if(list == null || list.isEmpty()) {
            throw new InvalidListException();
        }
        long product = 1;
        for(int i : list) {
            product *= i;
        }
        return product;
    }
}
