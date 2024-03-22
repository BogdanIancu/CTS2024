package ro.ase.acs.factorymethod;

public class PowerPointDocumentFactory
        implements AbstractOfficeDocumentFactory {
    @Override
    public OfficeDocument createDocument() {
        return new PowerPointDocument();
    }
}
