package com.Day6.IceCreamRush;

import java.util.ArrayList;
import java.util.List;

public class IceCreamRushApplication {

    public static void main(String[] args) {

        List<IceCreamFlavor> flavors = new ArrayList<>();
        flavors.add(new IceCreamFlavor("Vanilla", 50));
        flavors.add(new IceCreamFlavor("Chocolate", 75));
        flavors.add(new IceCreamFlavor("Strawberry", 40));
        flavors.add(new IceCreamFlavor("Mango", 60));
        flavors.add(new IceCreamFlavor("Pistachio", 35));
        flavors.add(new IceCreamFlavor("ButterScotch", 55));
        flavors.add(new IceCreamFlavor("BlackCherry", 20));
        flavors.add(new IceCreamFlavor("Coffee", 45));

        IceCreamShopManager manager = new IceCreamShopManager();

        // Sort flavors by popularity
        manager.sortFlavorsByPopularity(flavors);

        // Display sorted flavors
        manager.displayFlavors(flavors);
    }
}
