package ro.ase.acs.factorymethod;

public class WordDocumentFactory
        implements AbstractOfficeDocumentFactory {
    @Override
    public OfficeDocument createDocument() {
        return new WordDocument();
    }
}
