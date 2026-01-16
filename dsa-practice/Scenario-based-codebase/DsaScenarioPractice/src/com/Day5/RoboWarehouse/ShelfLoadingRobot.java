package com.Day5.RoboWarehouse;

import java.util.ArrayList;
import java.util.List;

public class ShelfLoadingRobot {

    private List<WarehousePackage> shelf = new ArrayList<>();

    // Insert package in sorted order using Insertion Sort logic
    public void loadPackage(WarehousePackage newPackage) {

        int i = shelf.size() - 1;

        // Shift heavier packages to the right
        while (i >= 0 && shelf.get(i).getWeight() > newPackage.getWeight()) {
            i--;
        }

        shelf.add(i + 1, newPackage);
    }

    public void displayShelf() {
        for (WarehousePackage wp : shelf) {
            System.out.println(wp);
        }
    }
}
