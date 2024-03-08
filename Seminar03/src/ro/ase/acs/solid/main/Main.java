package ro.ase.acs.solid.main;

import ro.ase.acs.solid.classes.ConsolePrinter;
import ro.ase.acs.solid.classes.ProductCalculator;
import ro.ase.acs.solid.classes.SumCalculator;
import ro.ase.acs.solid.interfaces.Readable;
import ro.ase.acs.solid.program.Program;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        Readable readable = null;
        try {
            readable = (Readable) Class.forName("ro.ase." +
                            "acs.solid.classes.ConsoleReader").
                getDeclaredConstructor().newInstance();
        } catch (InstantiationException | ClassNotFoundException |
                 IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {
            e.printStackTrace();
        }

        Program program = new Program(readable,
                new ConsolePrinter(), new ProductCalculator());
        program.run();

        program.setComputable(new SumCalculator());
        program.run();
    }
}
