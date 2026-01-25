package com.Generics.SmartWarehouseManagementSystem;

public class SmartWarehouseApplication {

    public static void main(String[] args) {

        StorageUnit<ElectronicsItem> electronicsStorage = new StorageUnit<>();
        electronicsStorage.addItem(new ElectronicsItem("E101", "Laptop"));
        electronicsStorage.addItem(new ElectronicsItem("E102", "Mobile"));

        StorageUnit<GroceryItem> groceryStorage = new StorageUnit<>();
        groceryStorage.addItem(new GroceryItem("G201", "Rice Bag"));
        groceryStorage.addItem(new GroceryItem("G202", "Sugar"));

        StorageUnit<FurnitureItem> furnitureStorage = new StorageUnit<>();
        furnitureStorage.addItem(new FurnitureItem("F301", "Chair"));
        furnitureStorage.addItem(new FurnitureItem("F302", "Table"));

        System.out.println("Electronics Storage:");
        WarehouseDisplayHelper.displayAllItems(electronicsStorage.getItems());

        System.out.println("\nGrocery Storage:");
        WarehouseDisplayHelper.displayAllItems(groceryStorage.getItems());

        System.out.println("\nFurniture Storage:");
        WarehouseDisplayHelper.displayAllItems(furnitureStorage.getItems());
    }
}

