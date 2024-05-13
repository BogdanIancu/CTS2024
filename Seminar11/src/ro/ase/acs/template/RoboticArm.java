package ro.ase.acs.template;

public class RoboticArm extends PartMover{
    @Override
    protected void liftPart() {
        System.out.println("The robotic arm is lifting the part");
    }

    @Override
    protected void transportPart() {
        System.out.println("The robotic arm is transporting the part");
    }

    @Override
    protected void dropPart() {
        System.out.println("The robotic arm is dropping the part");
    }
}
