package ro.ase.acs.dip.servicelocator.main;

import ro.ase.acs.dip.servicelocator.computations.Summable;

public class Main {
    public static void main(String[] args) {
        ServiceLocator serviceLocator = new ServiceLocator();

        Summable sum = (Summable) serviceLocator.resolve(Summable.class);
        sum.sum(4, 5);
    }
}
