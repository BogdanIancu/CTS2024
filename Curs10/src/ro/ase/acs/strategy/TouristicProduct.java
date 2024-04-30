package ro.ase.acs.strategy;

public class TouristicProduct {
    private ProductCategory category;
    private float price;

    public TouristicProduct(ProductCategory category, float price) {
        this.category = category;
        this.price = price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
