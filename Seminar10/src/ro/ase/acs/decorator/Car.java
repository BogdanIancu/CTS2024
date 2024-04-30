package ro.ase.acs.decorator;

public final class Car implements Vehicle {
    private String producer;
    private int power;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void start() {
        System.out.println("The car has started!");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped!");
    }
}
