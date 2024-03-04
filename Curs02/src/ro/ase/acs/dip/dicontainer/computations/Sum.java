package ro.ase.acs.dip.dicontainer.computations;

public class Sum implements SumContract {
    public Sum() {

    }

    @Override
    public void sum(float a, float b) {
        float result = a + b;
        System.out.println(result);
    }
}
