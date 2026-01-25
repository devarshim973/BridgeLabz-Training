package com.Generics.SmartWarehouseManagementSystem;

public class GroceryItem extends WarehouseItem {

    public GroceryItem(String itemId, String itemName) {
        super(itemId, itemName);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}
