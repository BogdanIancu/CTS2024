package ro.ase.acs.classes;

public class Operations {
    private AbstractFileReader fileReader;

    public Operations() {
    }

    public Operations(AbstractFileReader fileReader) {
        this.fileReader = fileReader;
    }

    public double sum(double... values) {
        double result = 0;
        if(values != null) {
            for (double d : values) {
                result += d;
            }
        }
        return result;
    }

    public double sumFromFile() {
        if(fileReader != null) {
            double[] valuesAsArray =
                    fileReader.readValuesFromFile().stream().mapToDouble(x -> (double) x).toArray();
            return sum(valuesAsArray);
        } else {
            return 0;
        }
    }
}
