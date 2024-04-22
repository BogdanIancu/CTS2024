package ro.ase.acs.flyweight;

public class LogoFlyweight implements AbstractLogo {
    private String base64;
    private String name;
    private int x = 200;
    private int y = 100;

    public LogoFlyweight(String base64, String name) {
        this.base64 = base64;
        this.name = name;
    }

    public void printLogo(int pageNumber) {
        System.out.println("Printing logo " + name + " at " +
                x + ":" + y +
                " on page " + pageNumber);
    }
}
