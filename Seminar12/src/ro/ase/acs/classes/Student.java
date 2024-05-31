package ro.ase.acs.classes;

import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private float grades[];

    public Student() {
    }

    public Student(String name, int age, float[] grades) {
        this.name = name;
        this.age = age;
        if(grades != null) {
            this.grades = Arrays.copyOf(grades, grades.length);
        } else {
            this.grades = grades;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float[] getGrades() {
        return Arrays.copyOf(grades, grades.length);
    }

    public void setGrades(float[] grades) {
        this.grades = Arrays.copyOf(grades, grades.length);
    }

    public float computeAverage() throws NullGradesException {
        double sum = 0;
        double average = 1;
        if(grades == null) {
            throw new NullGradesException();
        }
        if(grades.length > 0) {
            for (int i = 0; i < grades.length; i++) {
                sum += grades[i];
            }
            average = sum / grades.length;
        }

        if(average < 1) {
            average = 1;
        } else if(average > 10) {
            average = 10;
        }
        return (float)Math.floor(average * 100) / 100;
    }
}
