package ro.ase.acs.flyweight;

import java.util.HashMap;
import java.util.Map;

public class LogoFlyweightFactory {
    private Map<String, AbstractLogo> map = new HashMap<>();

    public AbstractLogo getLogo(String name) {
        if(!map.containsKey(name)) {
            LogoFlyweight logo = new LogoFlyweight("base64_value", name);
            map.put(name, logo);
        }
        return map.get(name);
    }
}
