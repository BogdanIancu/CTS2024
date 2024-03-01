package ro.ase.acs.solid.classes;

import ro.ase.acs.solid.interfaces.Computable;

import java.util.List;

public class SumCalculator implements Computable {
    @Override
    public long computeResult(List<Integer> list) {
        long sum = 0;
        for(int i : list) {
            sum += i;
        }
        return sum;
    }
}
