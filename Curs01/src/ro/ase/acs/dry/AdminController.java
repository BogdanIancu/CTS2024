package ro.ase.acs.dry;

public class AdminController {
    public void deleteUser(String user) {
        if (!isAuthenticated(user)) {
            throw new RuntimeException("User is not authenticated.");
        }
        //TODO Add delete logic here
    }

    private boolean isAuthenticated(String user) {
        return user != null && user.equals("user");
    }
}
