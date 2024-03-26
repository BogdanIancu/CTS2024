package ro.ase.acs.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeCollection {
    public static final String MALE_CHARACTER = "maleCharacter";
    public static final String FEMALE_CHARACTER = "femaleCharacter";
    private Map<String, GameCharacter> map = new HashMap<>();

    public PrototypeCollection() {
        map.put(MALE_CHARACTER, new MaleCharacter());
        map.put(FEMALE_CHARACTER, new FemaleCharacter());
    }

    public GameCharacter getCharacter(String characterType) {
        if(map.containsKey(characterType)) {
            GameCharacter character = map.get(characterType);
            try {
                return (GameCharacter) character.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException("Character not found");
        }
    }
}
