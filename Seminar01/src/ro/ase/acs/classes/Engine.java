package ro.ase.acs.classes;

public class Engine {
    private float power;
    private EngineType engineType = EngineType.GAS;

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
