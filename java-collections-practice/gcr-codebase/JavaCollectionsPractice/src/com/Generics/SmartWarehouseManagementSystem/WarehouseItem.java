package com.Generics.SmartWarehouseManagementSystem;

public abstract class WarehouseItem {

    private String itemId;
    private String itemName;

    public WarehouseItem(String itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    // Abstract method – forces child classes to implement
    public abstract String getCategory();

    public void displayItem() {
        System.out.println(
            "ID: " + itemId +
            ", Name: " + itemName +
            ", Category: " + getCategory()
        );
    }
}
