package ro.ase.acs.main;

import ro.ase.acs.builder.FoodItem;
import ro.ase.acs.builder.FoodItemBuilder;
import ro.ase.acs.builder.FoodItemDirector;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FoodItem.Builder foodItemBuilder = new FoodItem.Builder();
        foodItemBuilder.addName("Pizza margherita");
        foodItemBuilder.addPrice(10);
        foodItemBuilder.addIsVegetarian(true);
        FoodItem pizzaItem = foodItemBuilder.build();
        System.out.println(pizzaItem);
        FoodItem item = foodItemBuilder.build();
        System.out.println(item);
        System.out.println(pizzaItem);

        FoodItemBuilder builder = new FoodItemBuilder();
        builder.addName("Cola").addPrice(7).
                addBestBefore(LocalDate.now().plusDays(2));
        FoodItem cola = builder.build();
        System.out.println(cola);

        FoodItemDirector director = new FoodItemDirector();
        FoodItem chocolate = director.create("dark", "Milka", 13);
        System.out.println(chocolate);
    }
}