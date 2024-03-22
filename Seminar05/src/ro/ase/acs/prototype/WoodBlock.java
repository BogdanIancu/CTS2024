package ro.ase.acs.prototype;

public class WoodBlock extends BuildingBlock {
    private byte[] texture;

    public WoodBlock() {
        System.out.printf("Loading textures...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        texture = new byte[]{1, 2, 3};
    }

    @Override
    public void render() {
        System.out.println("Rendering the wood block");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        WoodBlock copy = (WoodBlock) super.clone();

        copy.texture = this.texture.clone();

        return copy;
    }
}
