package ro.ase.acs.solid.classes;

import ro.ase.acs.solid.interfaces.Printable;

public class ConsolePrinter implements Printable {
    @Override
    public void printResult(long result) {
        System.out.println("The result is: " + result);
    }
}
