package ro.ase.acs.chain;

public abstract class AirportHandler {
    protected AirportHandler nextHandler;

    public void setNextHandler(AirportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void verify() throws Exception;
}
