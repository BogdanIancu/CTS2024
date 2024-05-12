package ro.ase.acs.memento;

public class Product {
    public String name;
    public int quantity;
    public int price;

    public Product() {
    }

    public Product(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
