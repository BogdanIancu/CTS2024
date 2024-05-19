package ro.ase.acs.tests;

import org.junit.Before;
import org.junit.Test;
import ro.ase.acs.classes.Operations;

import static org.junit.Assert.*;

public class OperationsTests {
    private Operations operations;

    @Before
    public void initializeOperations() {
        operations = new Operations();
    }

    @Test
    public void whenValidValuesThenCorrectSum() {
        //Arrange
        Operations operations = new Operations();
        double[] input = new double[] {3, -3, 7, 5};
        //Act
        double result = operations.sum(input);
        //Assert
        assertEquals("The sum is not correct for valid input", 12, result, 0.1);
    }

    @Test
    public void whenNoInputThenResultShouldBeZero() {
        Operations operations = new Operations();
        double result = operations.sum();
        assertEquals("The sum for empty array is not zero", 0, result, 0.1);
    }

    @Test
    public void whenNullArrayThenResultShouldBeZero() {
        Operations operations = new Operations();
        double result = operations.sum(null);
        assertEquals("The sum for a null array is not zero", 0, result, 0.1);
    }
}
