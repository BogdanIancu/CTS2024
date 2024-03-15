package ro.ase.acs.simplefactory;

public class RestApiProduction implements RestApi {
    RestApiProduction() {
    }

    @Override
    public void connect() {
        System.out.println("Connecting to the " +
                "production server");
    }
}
