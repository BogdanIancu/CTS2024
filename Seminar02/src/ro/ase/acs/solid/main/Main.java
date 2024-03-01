package ro.ase.acs.solid.main;

import ro.ase.acs.solid.classes.ConsolePrinter;
import ro.ase.acs.solid.classes.ConsoleReader;
import ro.ase.acs.solid.classes.ProductCalculator;
import ro.ase.acs.solid.interfaces.Computable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Computable calculator = new ProductCalculator();
        ConsoleReader consoleReader = new ConsoleReader();
        ConsolePrinter consolePrinter = new ConsolePrinter();

        List<Integer> list = consoleReader.readValues();
        long result = calculator.computeResult(list);
        consolePrinter.printResult(result);
    }
}
