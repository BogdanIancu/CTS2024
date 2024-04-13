package ro.ase.acs.facade;
class Engine {
    private int power;
    private int load;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        System.out.println("Engine load: " + load);
        this.load = load;
    }
}
