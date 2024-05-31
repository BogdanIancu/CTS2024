package ro.ase.acs.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.acs.classes.Operations;
import ro.ase.acs.tests.categories.ImportantTest;
import ro.ase.acs.tests.mocks.FileReaderFake;

import java.util.List;

public class OtherOperationsTests {

    @Test
    public void testSumFromFileStub() {
        //Operations operations = new Operations(new FileReaderStub());
        Operations operations = new Operations(() -> List.of(1, 2, 3));
        double result = operations.sumFromFile();
        Assert.assertEquals("The sum is not correct", 6, result, 0.001);
    }

    @Test
    @Category(ImportantTest.class)
    public void testSumFromFileFake() {
        FileReaderFake fileReaderFake = new FileReaderFake();
        fileReaderFake.setValues(List.of(6, 4, 2, 1, 5));
        Operations operations = new Operations(fileReaderFake);
        double result = operations.sumFromFile();
        Assert.assertEquals("The sum is not correct", 18, result, 0.001);
    }
}
