package ro.ase.acs.dip.servicelocator.printers;

public class Printer implements Printable {
    @Override
    public void print(double result) {
        System.out.println(result);
    }
}
