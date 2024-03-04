package ro.ase.acs.dip.servicelocator.main;

import ro.ase.acs.dip.servicelocator.computations.Sum;
import ro.ase.acs.dip.servicelocator.computations.Summable;
import ro.ase.acs.dip.servicelocator.printers.Printable;
import ro.ase.acs.dip.servicelocator.printers.Printer;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {
    private Map<Class, Class> repo = new HashMap();

    public ServiceLocator() {
        register(Printable.class, Printer.class);
        register(Summable.class, Sum.class);
    }

    public void register(Class contract, Class implementation) {
        repo.put(contract, implementation);
    }

    public Object resolve(Class contract) {
        Class implementation = repo.get(contract);
        try {
            return implementation.getConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
