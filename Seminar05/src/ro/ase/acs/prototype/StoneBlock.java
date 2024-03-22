package ro.ase.acs.prototype;

public class StoneBlock extends BuildingBlock {
    private byte[] texture;

    public StoneBlock() {
        System.out.println("Loading textures...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        texture = new byte[]{4, 5, 6};
    }

    @Override
    public void render() {
        System.out.printf("Rendering the stone block");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        StoneBlock copy = (StoneBlock) super.clone();

        copy.texture = this.texture.clone();

        return copy;
    }
}
