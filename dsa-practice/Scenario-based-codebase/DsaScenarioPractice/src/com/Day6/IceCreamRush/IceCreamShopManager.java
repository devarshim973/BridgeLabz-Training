package com.Day6.IceCreamRush;

import java.util.List;

public class IceCreamShopManager {

    // Bubble Sort flavors by sales count descending
    public void sortFlavorsByPopularity(List<IceCreamFlavor> flavors) {
        int n = flavors.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (flavors.get(j).getSalesCount() < flavors.get(j + 1).getSalesCount()) {
                    // Swap
                    IceCreamFlavor temp = flavors.get(j);
                    flavors.set(j, flavors.get(j + 1));
                    flavors.set(j + 1, temp);
                }
            }
        }
    }

    // Display flavors
    public void displayFlavors(List<IceCreamFlavor> flavors) {
        System.out.println("Flavors sorted by popularity:");
        for (IceCreamFlavor flavor : flavors) {
            System.out.println(flavor);
        }
    }
}
