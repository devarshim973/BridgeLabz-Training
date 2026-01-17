package com.Collections.ImplementaShoppingCart;

import java.util.*;

public class ShoppingCartManagerService {

    // HashMap: product -> price (fast lookup)
    private Map<String, Double> priceMap = new HashMap<>();

    // LinkedHashMap: product -> price (insertion order)
    private Map<String, Double> cartOrderMap = new LinkedHashMap<>();

    // TreeMap: product -> price (sorted by price)
    private Map<Double, List<String>> priceSortedMap = new TreeMap<>();

    // Add product to catalog and cart
    public void addProduct(ShoppingProductItem product) {

        String name = product.getName();
        double price = product.getPrice();

        // HashMap
        priceMap.put(name, price);

        // LinkedHashMap
        cartOrderMap.put(name, price);

        // TreeMap (price -> list of products with same price)
        priceSortedMap.computeIfAbsent(price, k -> new ArrayList<>()).add(name);
    }

    // Display products in HashMap (unordered)
    public void displayPriceMap() {
        System.out.println("Price Map (HashMap, unordered): " + priceMap);
    }

    // Display products in insertion order
    public void displayCartOrder() {
        System.out.println("Cart Order (LinkedHashMap): " + cartOrderMap);
    }

    // Display products sorted by price
    public void displayProductsByPrice() {
        System.out.println("Products Sorted by Price (TreeMap):");
        for (Map.Entry<Double, List<String>> entry : priceSortedMap.entrySet()) {
            System.out.println("$" + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
