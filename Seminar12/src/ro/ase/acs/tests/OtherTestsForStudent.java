package ro.ase.acs.tests;

import org.junit.Test;
import ro.ase.acs.classes.NullGradesException;
import ro.ase.acs.classes.Student;
import java.util.List;

import static org.junit.Assert.assertEquals;

//Right-BICEP
public class OtherTestsForStudent {
    @Test
    public void testStudentAverageRight() {
        String name = "Ionel";
        int age = 21;
        float[] grades = new float[] { 9, 8, 6 };
        Student s = new Student(name, age, grades);

        float result = s.computeAverage();
        assertEquals("The average is not correctly computed", 7.66, result, 0.009);
    }

    @Test
    public void testStudentAverageBoundaryLeft() {
        String name = "Ionel";
        int age = 21;
        float[] grades = new float[] { 1, 1, 0.99f };
        Student s = new Student(name, age, grades);

        float result = s.computeAverage();
        assertEquals("The average is not correctly computed at the left boundary",
                1, result, 0.009);
    }

    @Test
    public void testStudentAverageBoundary() {
        String name = "Ionel";
        int age = 21;
        float[] grades = new float[] { 1, 1, 1 };
        Student s = new Student(name, age, grades);

        float result = s.computeAverage();
        assertEquals("The average is not correctly computed at the left boundary",
                1, result, 0.009);
    }

    @Test
    public void testStudentAverageBoundaryRight() {
        String name = "Ionel";
        int age = 21;
        float[] grades = new float[] { 1, 1.1f, 1.1f };
        Student s = new Student(name, age, grades);

        float result = s.computeAverage();
        assertEquals("The average is not correctly computed at the right of the boundary",
                1.06, result, 0.009);
    }

    @Test
    public void testStudentAverageInverse() {
        Student s = new Student("Ionel", 21, new float[] { 9, 8, 6 });
        double average = s.computeAverage();
        double sum = 9 + 8 + 6;
        assertEquals("The inverse relationship is not met", sum, average * 3, 0.1);
    }

    @Test
    public void testStudentAverageCrossCheck() {
        List<Float> grades = List.of(9.0f, 8.0f, 6.0f);
        float[] gradesArray = new float[] {9, 8, 6};
        Student s = new Student("Ionel", 21, gradesArray);
        double computedAverage = s.computeAverage();
        double otherAverage = grades.stream().mapToDouble(x -> x).average().getAsDouble();
        assertEquals("The cross check is not met", otherAverage, computedAverage, 0.009);
    }

    @Test(expected = NullGradesException.class)
    public void testStudentAverageErrorCondition() {
        Student s = new Student("Ionel", 21 , null);
        s.computeAverage();
    }

    @Test(timeout =  1)
    public void testStudentAveragePerformance() {
        float[] grades = new float[1000];
        for(int i = 0; i < 500; i++) {
            grades[i] = 7;
        }
        for(int i = 500; i < 1000; i++) {
            grades[i] = 8;
        }
        Student s = new Student("Ionel", 21, grades);
        s.computeAverage();
    }
}
