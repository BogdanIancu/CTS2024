package ro.ase.acs.dry;

public class UserController {
    public void updateUserProfile(String user, String request) {
        if (!isAuthenticated(user)) {
            throw new RuntimeException("User is not authenticated.");
        }
        //TODO Add update logic
    }

    private boolean isAuthenticated(String user) {
        return user != null && user.equals("user");
    }
}

