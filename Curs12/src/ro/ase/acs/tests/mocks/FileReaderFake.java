package ro.ase.acs.tests.mocks;

import ro.ase.acs.classes.AbstractFileReader;

import java.util.List;

public class FileReaderFake implements AbstractFileReader {
    private List<Integer> values;

    public void setValues(List<Integer> values) {
        this.values = values;
    }

    @Override
    public List<Integer> readValuesFromFile() {
        return values;
    }
}
