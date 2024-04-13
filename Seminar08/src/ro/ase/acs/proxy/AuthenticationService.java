package ro.ase.acs.proxy;

public class AuthenticationService implements AbstractAuthenticationService {

    private static final String PASSWORD = "admin";
    private static final String USERNAME = "admin";

    @Override
    public boolean login(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}
