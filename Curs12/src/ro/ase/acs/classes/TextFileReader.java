package ro.ase.acs.classes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Vector;

public class TextFileReader implements AbstractFileReader{

    @Override
    public List<Integer> readValuesFromFile() {
        List<Integer> values = new Vector<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("values.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String result = "";
            while((result = reader.readLine()) != null) {
                int value = Integer.parseInt(result);
                values.add(value);
            }
            return values;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
