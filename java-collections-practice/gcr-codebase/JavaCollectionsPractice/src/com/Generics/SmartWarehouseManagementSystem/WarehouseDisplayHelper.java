package com.Generics.SmartWarehouseManagementSystem;

import java.util.List;

public class WarehouseDisplayHelper {

    // Wildcard method
    public static void displayAllItems(List<? extends WarehouseItem> itemList) {

        for (WarehouseItem item : itemList) {
            item.displayItem();
        }
    }
}
