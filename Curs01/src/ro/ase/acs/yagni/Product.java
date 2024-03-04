package ro.ase.acs.yagni;

public class Product {
    private String name;
    private double price;
    private String description;
    private double discount; //TODO delete this filed, not necessary


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //TODO delete this function, the store doesn't have a loyalty program
    public double calculateDiscountedPrice(float loyaltyPoints) {
        discount = 0;
        if(loyaltyPoints < 10) {
            discount = price * 0.01;
        } else if (loyaltyPoints >= 10 && loyaltyPoints < 20){
            discount = price * 0.05;
        }
        //...
        return price - discount;
    }
}

