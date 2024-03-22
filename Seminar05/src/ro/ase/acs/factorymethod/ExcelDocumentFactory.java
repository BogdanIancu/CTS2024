package ro.ase.acs.factorymethod;

public class ExcelDocumentFactory
        implements AbstractOfficeDocumentFactory {
    @Override
    public OfficeDocument createDocument() {
        return new ExcelDocument();
    }
}
