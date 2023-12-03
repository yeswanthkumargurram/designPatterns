package org.example.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class CoffeeFlavorFactory {
    private final Map<String, CoffeeFlavor> flavors;

    public CoffeeFlavorFactory() {
        flavors = new HashMap<>();
    }
    CoffeeFlavor getCoffeeFlavor(String flavorName){
        return flavors.computeIfAbsent(flavorName, CoffeeFlavor::new);
    }
    int getTotalFlavors(){
        return flavors.size();
    }

}
