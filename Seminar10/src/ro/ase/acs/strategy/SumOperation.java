package ro.ase.acs.strategy;

import java.util.List;

public class SumOperation implements Operation{
    @Override
    public double doOperation(List<Integer> numbers) {
        return numbers.stream().mapToInt(x->x).sum();
    }

}
