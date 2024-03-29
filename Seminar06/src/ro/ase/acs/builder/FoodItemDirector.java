package ro.ase.acs.builder;

import java.time.LocalDate;

public class FoodItemDirector {
    private FoodItemBuilder builder;

    public FoodItem create(String name, String producer, float price){
        builder = new FoodItemBuilder();
        builder.addName(name);
        builder.addProducer(producer).addPrice(price);
        return builder.build();
    }

    public FoodItem create(String name, LocalDate bestBefore){
        builder = new FoodItemBuilder();
        builder.addName(name).addBestBefore(bestBefore);
        return builder.build();
    }
}
