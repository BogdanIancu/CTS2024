package ro.ase.acs.solid.classes;

import ro.ase.acs.solid.interfaces.Readable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader implements Readable {
    private static final int NO_OF_VALUES = 5;

    @Override
    public List<Integer> readValues() {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Please input %d values: ",
                NO_OF_VALUES);
        for (int i = 0; i < NO_OF_VALUES; i++) {
            int value = scanner.nextInt();
            list.add(value);
        }

        return list;
    }
}
