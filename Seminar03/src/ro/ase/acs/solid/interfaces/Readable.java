package ro.ase.acs.solid.interfaces;

import java.util.List;

public interface Readable {
    /**
     * Reads a list of values from a given source
     * @return the obtained list
     */
    List<Integer> readValues();
}
