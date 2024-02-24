package ro.ase.acs.classes;

public abstract class Vehicle {
    private String color;
    private float price;

    public Vehicle() {
    }

    public Vehicle(String color, float price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float computeFinalPrice();
}
