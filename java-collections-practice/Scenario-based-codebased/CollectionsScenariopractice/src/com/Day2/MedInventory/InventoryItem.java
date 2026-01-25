package com.Day2.MedInventory;

import java.time.LocalDate;

public class InventoryItem {

    private String itemId;
    private String itemName;
    private int quantity;
    private LocalDate expiryDate;

    public InventoryItem(String itemId, String itemName, int quantity, LocalDate expiryDate) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof InventoryItem)) return false;
        InventoryItem other = (InventoryItem) obj;
        return itemId.equals(other.itemId);
    }

    @Override
    public int hashCode() {
        return itemId.hashCode();
    }

    @Override
    public String toString() {
        return itemName + " | Qty: " + quantity + " | Exp: " + expiryDate;
    }
}
