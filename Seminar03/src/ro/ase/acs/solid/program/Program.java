package ro.ase.acs.solid.program;

import ro.ase.acs.solid.exceptions.InvalidListException;
import ro.ase.acs.solid.interfaces.Computable;
import ro.ase.acs.solid.interfaces.Printable;
import ro.ase.acs.solid.interfaces.Readable;

import java.util.List;

public class Program {
    private final Readable readable;
    private final Printable printable;
    private Computable computable;

    public Program(Readable readable, Printable printable, Computable computable) {
        this.readable = readable;
        this.printable = printable;
        this.computable = computable;
    }

    public void setComputable(Computable computable) {
        this.computable = computable;
    }

    public void run() {
        List<Integer> list = readable.readValues();
        long result;
        try {
            result = computable.computeResult(list);
        } catch (InvalidListException e) {
            throw new RuntimeException(e);
        }
        printable.printResult(result);
    }
}
