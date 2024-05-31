package ro.ase.acs.tests;

import org.junit.Test;
import ro.ase.acs.classes.NullGradesException;
import ro.ase.acs.classes.Student;

import static org.junit.Assert.*;

public class StudentTests {
    @Test
    public void parameterizedConstructorTest() {
        //Arrange
        String name = "Ionel";
        int age = 21;
        float[] grades = new float[] { 9, 8, 7 };
        //Act
        Student s = new Student(name, age, grades);
        String obtainedName = s.getName();
        //Assert
        assertEquals("The constructor doesn't correctly initialize the name",
                name, obtainedName);
    }

    //CORRECT

    @Test
    public void testStudentAverageConformance() {
        String name = "Ionel";
        int age = 21;
        float[] grades = new float[] { 9, 8, 6 };
        Student s = new Student(name, age, grades);

        float result = s.computeAverage();
        assertEquals("The average is not conform", 7.66, result, 0.009);
    }

    @Test
    public void testStudentAverageOrdering() {
        Student s1 = new Student("Ionel", 21, new float[] { 9, 4, 7 });
        Student s2 = new Student("Gigel", 20, new float[] { 4, 7, 9 });
        float firstAverage = s1.computeAverage();
        float secondAverage = s2.computeAverage();

        assertEquals("The grade order influences the average", firstAverage, secondAverage, 0.009);
    }

    @Test
    public void testStudentAverageRangeMin() {
        Student s = new Student("Ionel", 21, new float[] { 0, 0, 1 });
        float result = s.computeAverage();
        assertEquals("The minimum average is not 1", 1, result, 0.009);
    }

    @Test
    public void testStudentAverageRangeMax() {
        Student s = new Student("Ionel", 21, new float[] { 10, 10, 11 });
        float result = s.computeAverage();
        assertEquals("The maximum average is not 10", 10, result, 0.009);
    }

    @Test(expected = NullGradesException.class)
    public void testStudentAverageReference() {
        Student s = new Student("Ionel", 21, null);
        s.computeAverage();
    }

    @Test
    public void testStudentAverageCardinality0() {
        Student s = new Student("Ionel", 21, new float[] {});
        float result = s.computeAverage();
        assertEquals("The average is not 1 for 0 grades", 1, result, 0.009);
    }

    @Test
    public void testStudentAverageCardinality1() {
        Student s = new Student("Ionel", 21, new float[] {8});
        float result = s.computeAverage();
        assertEquals("The average is not correct for 1 grade", 8, result, 0.009);
    }

    @Test
    public void testStudentAverageCardinalityN() {
        float[] grades = new float[50];
        for(int i = 0; i < 25; i++) {
            grades[i] = 7;
        }
        for(int i = 25; i < 50; i++) {
            grades[i] = 8;
        }
        Student s = new Student("Ionel", 21, grades);
        float result = s.computeAverage();
        assertEquals("The average is not correct for 50 grades", 7.5, result, 0.009);
    }

    @Test(timeout =  1)
    public void testStudentAverageCardinalityTimeout() {
        float[] grades = new float[50];
        for(int i = 0; i < 25; i++) {
            grades[i] = 7;
        }
        for(int i = 25; i < 50; i++) {
            grades[i] = 8;
        }
        Student s = new Student("Ionel", 21, grades);
        s.computeAverage();
    }
}
