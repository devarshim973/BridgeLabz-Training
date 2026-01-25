package com.Day2.MedInventory;

import java.util.*;

public class MedInventoryApp {

    public static void main(String[] args) {

        MedInventoryProcessor<InventoryItem> processor =
                new MedInventoryProcessor<>();

        try {
            Set<InventoryItem> inventory =
                    processor.readInventory("inventory.csv",
                            InventoryItem::new);

            System.out.println("=== Unique Inventory Items ===");
            inventory.forEach(System.out::println);

            System.out.println("\n=== Expired Items ===");
            processor.getExpiredItems(inventory)
                     .forEach(System.out::println);

            System.out.println("\n=== Categorized Items ===");
            Map<String, List<InventoryItem>> map =
                    processor.categorizeByType(inventory);

            map.forEach((k, v) -> {
                System.out.println(k + " -> " + v);
            });

        } catch (LowStockException e) {
            System.out.println("ALERT: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
