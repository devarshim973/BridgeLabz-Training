package com.Generics.SmartWarehouseManagementSystem;

public class FurnitureItem extends WarehouseItem {

    public FurnitureItem(String itemId, String itemName) {
        super(itemId, itemName);
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}
