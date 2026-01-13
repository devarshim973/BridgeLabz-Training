package com.Day3.SmartCheckout;

import java.util.HashMap;

public class ItemStockManager {

    private HashMap<String, Double> priceMap = new HashMap<>();
    private HashMap<String, Integer> stockMap = new HashMap<>();

    public void addItem(String itemName, double price, int stock) {
        priceMap.put(itemName, price);
        stockMap.put(itemName, stock);
    }

    public double getPrice(String itemName) {
        return priceMap.get(itemName);
    }

    public boolean isInStock(String itemName, int quantity) {
        return stockMap.get(itemName) >= quantity;
    }

    public void updateStock(String itemName, int quantity) {
        stockMap.put(itemName, stockMap.get(itemName) - quantity);
    }
}
