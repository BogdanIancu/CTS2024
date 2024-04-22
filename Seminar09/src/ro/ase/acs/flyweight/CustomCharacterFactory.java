package ro.ase.acs.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CustomCharacterFactory {
    private Map<Character, TextCharacter> map = new HashMap<>();
    public TextCharacter getCustomCharacter(char key) {
        if (!map.containsKey(key)) {
            CustomCharacter customCharacter =
                    new CustomCharacter(key, new byte[] {1, 2, 3});
            map.put(key, customCharacter);
            System.out.println("Character created");
        }
        else {
            System.out.println("Character reused");
        }
        return map.get(key);
    }
}
