package ro.ase.acs.composite;

import javax.naming.OperationNotSupportedException;
import java.util.List;

public interface AbstractTouristicPackage {
    double getPrice();
    void addComponent(AbstractTouristicPackage component) throws OperationNotSupportedException;
    void deleteComponent(AbstractTouristicPackage component) throws OperationNotSupportedException;
    List<AbstractTouristicPackage> getComponents() throws OperationNotSupportedException;
}
