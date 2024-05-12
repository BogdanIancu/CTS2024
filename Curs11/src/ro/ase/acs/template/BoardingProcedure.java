package ro.ase.acs.template;

public abstract class BoardingProcedure {
    public final void executeProcedure() {
        dropLuggage();
        checkIn();
        securityCheck();
        board();
    }

    public abstract void dropLuggage();
    public abstract void checkIn();
    public abstract void securityCheck();
    public abstract void board();
}
