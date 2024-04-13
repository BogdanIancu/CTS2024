package ro.ase.acs.facade;

class BrakingSystem {
    private int load;

    public void applyFrontBrakes(){
        System.out.println("Applying front brakes");

        if(load <= 40){
            load+=60;
        }
    }

    public void applyRearBrakes(){
        System.out.println("Applying rear brakes");

        if(load <= 60){
            load+=40;
        }
    }

    public void releaseBrakes(){
        System.out.println("Brakes released");
        load = 0;
    }
}
