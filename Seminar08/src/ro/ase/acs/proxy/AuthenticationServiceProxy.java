package ro.ase.acs.proxy;

public class AuthenticationServiceProxy implements AbstractAuthenticationService {
    private AbstractAuthenticationService authenticationService;
    private int noOfFailedAttempts = 0;

    public AuthenticationServiceProxy(AbstractAuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @Override
    public boolean login(String username, String password) {
        if (noOfFailedAttempts > 4) {
            return false;
        }

        boolean isSuccessful = authenticationService.login(username, password);

        if (!isSuccessful) {
            noOfFailedAttempts++;
        } else {
            noOfFailedAttempts = 0;
        }

        return isSuccessful;
    }
}
