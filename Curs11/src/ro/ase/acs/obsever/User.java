package ro.ase.acs.obsever;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void receivePriceNotification(String message) {
        System.out.println(name + ": " + message);
    }
}
