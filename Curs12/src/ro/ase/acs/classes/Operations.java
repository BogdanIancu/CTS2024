package ro.ase.acs.classes;

public class Operations {
    public double sum(double... values) {
        double result = 0;
        if(values != null) {
            for (double d : values) {
                result += d;
            }
        }
        return result;
    }
}
