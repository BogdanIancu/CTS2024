package ro.ase.acs.classes;

import ro.ase.acs.interfaces.Taxable;

public final class Car extends Vehicle implements Taxable {
    private String producer;
    private int productionYear;
    private Engine engine;
    private final int NB_OF_SEATS = 5;

    public Car() {
        super("red", 5000);
        producer = "";
        productionYear = 1950;
    }

    public Car(String producer, int productionYear) {
        this.producer = producer;
        this.productionYear = productionYear;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void printDetails() {
        System.out.println(producer + " " + productionYear);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public float computeFinalPrice() {
        if(engine != null)
        {
            if(engine.getEngineType() == EngineType.ELECTRIC)
            {
                return getPrice() - 10_000;
            }
            if(engine.getEngineType() == EngineType.HYBRID)
            {
                return getPrice() - 5000;
            }
        }
        return getPrice();
    }

    @Override
    public final float computeTax() {
        return getPrice() * 0.01f;
    }
}
