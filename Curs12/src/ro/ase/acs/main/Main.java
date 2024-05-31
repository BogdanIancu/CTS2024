package ro.ase.acs.main;

import ro.ase.acs.classes.Operations;
import ro.ase.acs.classes.TextFileReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double result = new Operations(new TextFileReader()).sumFromFile();
        System.out.println("Sum = " + result);
    }
}
