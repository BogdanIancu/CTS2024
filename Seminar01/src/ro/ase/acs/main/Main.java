package ro.ase.acs.main;

import ro.ase.acs.classes.Car;
import ro.ase.acs.classes.Engine;
import ro.ase.acs.classes.EngineType;
import ro.ase.acs.interfaces.Taxable;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setProducer("Dacia");
        car.printDetails();

        Engine engine = new Engine();
        engine.setPower(200);
        car.setEngine(engine);
        car.setPrice(20_000);
        System.out.println(car.computeFinalPrice());
        engine.setEngineType(EngineType.ELECTRIC);
        System.out.println(car.computeFinalPrice());

        System.out.println(car.computeTax());
        Taxable t = car;
        System.out.println(t.isTaxable());
    }
}
