package ro.ase.acs.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeCollection {
    private Map<String,BuildingBlock> map = new HashMap<>();

    public PrototypeCollection() {
        map.put("wood",new WoodBlock());
        map.put("stone",new StoneBlock());
    }

    public BuildingBlock getBlock(String blockType){
        try {
            return (BuildingBlock) map.get(blockType).clone();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
