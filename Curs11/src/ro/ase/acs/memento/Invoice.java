package ro.ase.acs.memento;

import java.util.ArrayList;
import java.util.List;

public class Invoice implements Cloneable {
    private List<Product> products = new ArrayList<>();
    private String supplier;
    private String client;

    public String getSupplier() {
        return supplier;
    }

    void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getClient() {
        return client;
    }

    void setClient(String client) {
        this.client = client;
    }

    List<Product> getProducts() {
        return products;
    }

    public Invoice(String supplier, String client) {
        this.supplier = supplier;
        this.client = client;
    }

    public double getTotalValue(double vat) {
        double invoiceTotal = products.stream().mapToDouble(p -> p.price * p.quantity).sum();
        return invoiceTotal * ((100 + vat) / 100);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Invoice copy = (Invoice)super.clone();
        copy.supplier = supplier;
        copy.client = client;
        copy.products = List.copyOf(products);
        return copy;
    }
}
