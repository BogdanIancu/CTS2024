package ro.ase.acs.simplefactory;

public class RestApiDevelopment implements RestApi {
    RestApiDevelopment() {
    }

    @Override
    public void connect() {
        System.out.println("Connecting to the" +
                " development server");
    }
}
