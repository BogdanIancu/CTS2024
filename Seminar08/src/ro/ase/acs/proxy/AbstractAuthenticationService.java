package ro.ase.acs.proxy;

public interface AbstractAuthenticationService {
    boolean login(String username, String password);
}
