package ro.ase.acs.factorymethod;

public class PowerPointDocument implements OfficeDocument{
    private String name;

    PowerPointDocument() {}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Opening the PowerPoint document");
    }
}
