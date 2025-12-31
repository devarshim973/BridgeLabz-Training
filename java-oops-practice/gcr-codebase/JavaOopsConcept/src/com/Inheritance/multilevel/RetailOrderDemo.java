package com.Inheritance.multilevel;

public class RetailOrderDemo {
    public static void main(String[] args) {

        // Create objects
        RetailOrder order1 = new RetailOrder(101, "2025-12-31");
        ShippedRetailOrder order2 = new ShippedRetailOrder(102, "2025-12-30", "TRK12345");
        DeliveredRetailOrder order3 = new DeliveredRetailOrder(103, "2025-12-29", "TRK67890", "2025-12-31");

        // Store in array for polymorphism demonstration
        RetailOrder[] orders = {order1, order2, order3};

        System.out.println("Retail Order Statuses:\n");
        for (RetailOrder o : orders) {
            o.displayOrderInfo();
            System.out.println("--------------------------");
        }
    }
}