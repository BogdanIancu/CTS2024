package ro.ase.acs.tests.mocks;

import ro.ase.acs.classes.AbstractFileReader;

import java.util.List;

public class FileReaderStub implements AbstractFileReader {
    @Override
    public List<Integer> readValuesFromFile() {
        return List.of(1, 2, 3);
    }
}
