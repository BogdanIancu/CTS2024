package ro.ase.acs.dip.servicelocator.computations;

import ro.ase.acs.dip.servicelocator.main.ServiceLocator;
import ro.ase.acs.dip.servicelocator.printers.Printable;

public class Sum implements Summable {
    private ServiceLocator serviceLocator = new ServiceLocator();
    private Printable printable;

    public Sum() {
            printable = (Printable) serviceLocator.resolve(Printable.class);
    }

    @Override
    public void sum(float a, float b) {
        float result = a + b;
        printable.print(result);
    }
}
