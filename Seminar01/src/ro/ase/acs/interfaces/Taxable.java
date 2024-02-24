package ro.ase.acs.interfaces;

public interface Taxable {
    float computeTax();
    default boolean isTaxable() {
        return true;
    }
}
