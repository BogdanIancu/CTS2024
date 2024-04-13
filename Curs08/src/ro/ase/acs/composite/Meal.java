package ro.ase.acs.composite;

import javax.naming.OperationNotSupportedException;
import java.util.List;

public class Meal implements AbstractTouristicPackage{
    @Override
    public double getPrice() {
        return 10;
    }

    @Override
    public void addComponent(AbstractTouristicPackage component) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    @Override
    public void deleteComponent(AbstractTouristicPackage component) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    @Override
    public List<AbstractTouristicPackage> getComponents() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }
}
