package com.Generics.SmartWarehouseManagementSystem;

public class ElectronicsItem extends WarehouseItem {

    public ElectronicsItem(String itemId, String itemName) {
        super(itemId, itemName);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}
