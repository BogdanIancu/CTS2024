package ro.ase.acs.template;

public class Worker extends PartMover{
    @Override
    protected void liftPart() {
        System.out.println("The worker is lifting the part");
    }

    @Override
    protected void transportPart() {
        System.out.println("The worker is transporting the part");
    }

    @Override
    protected void dropPart() {
        System.out.println("The worker is dropping the part");
    }
}
