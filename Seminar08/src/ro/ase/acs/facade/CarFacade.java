package ro.ase.acs.facade;

public class CarFacade {
    Engine engine = new Engine();
    BrakingSystem brakingSystem = new BrakingSystem();
    LightingSystem lightingSystem = new LightingSystem();

    public void start(){
        lightingSystem.turnOnLowBeam();
        brakingSystem.releaseBrakes();
        engine.setLoad(10);
    }

    public void emergencyBrake(){
        engine.setLoad(0);
        brakingSystem.applyFrontBrakes();
        brakingSystem.applyRearBrakes();
        lightingSystem.turnOnHazardLights();
    }

    public void park(){
        engine.setLoad(0);
        brakingSystem.applyRearBrakes();
        lightingSystem.turnOffAllLights();
    }
}
