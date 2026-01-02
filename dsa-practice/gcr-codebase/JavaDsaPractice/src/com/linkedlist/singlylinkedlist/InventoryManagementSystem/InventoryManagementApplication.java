package com.linkedlist.singlylinkedlist.InventoryManagementSystem;

public class InventoryManagementApplication {
    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtEnd(101, "Laptop", 5, 55000);
        inventory.addAtEnd(102, "Mouse", 50, 500);
        inventory.addAtBeginning(103, "Keyboard", 30, 1500);
        inventory.addAtPosition(2, 104, "Monitor", 10, 12000);

        System.out.println("\nInventory List:");
        inventory.displayInventory();

        System.out.println("\nSearch by ID 102:");
        inventory.searchById(102);

        System.out.println("\nUpdating Quantity of ID 101:");
        inventory.updateQuantity(101, 7);

        System.out.println("\nTotal Inventory Value:");
        inventory.calculateTotalValue();

        System.out.println("\nSorting by Name (Ascending):");
        inventory.sortByName(true);
        inventory.displayInventory();

        System.out.println("\nSorting by Price (Descending):");
        inventory.sortByPrice(false);
        inventory.displayInventory();
    }
}

