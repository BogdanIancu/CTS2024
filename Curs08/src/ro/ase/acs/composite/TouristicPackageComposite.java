package ro.ase.acs.composite;

import java.util.ArrayList;
import java.util.List;

public class TouristicPackageComposite implements AbstractTouristicPackage {
    List<AbstractTouristicPackage> components = new ArrayList<>();

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for(AbstractTouristicPackage x : getComponents()) {
            totalPrice += x.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void addComponent(AbstractTouristicPackage component) {
        components.add(component);
    }

    @Override
    public void deleteComponent(AbstractTouristicPackage component) {
        components.remove(component);
    }

    @Override
    public List<AbstractTouristicPackage> getComponents() {
        return components;
    }
}
