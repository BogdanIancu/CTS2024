package ro.ase.acs.kiss;

import java.util.Map;

public class AdvancedTemperatureConverter {
    private Map<String, TemperatureScale> scales;
    private ConversionMode conversionMode;

    //...

    public double convertTemperature(double temperature, String fromScale, String toScale) {
        double convertedTemperature = temperature;
        //...
        return convertedTemperature;
    }
}

