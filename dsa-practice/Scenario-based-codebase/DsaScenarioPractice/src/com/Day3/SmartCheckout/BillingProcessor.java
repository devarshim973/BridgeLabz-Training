package com.Day3.SmartCheckout;

public class BillingProcessor {

    private ItemStockManager stockManager;

    public BillingProcessor(ItemStockManager stockManager) {
        this.stockManager = stockManager;
    }

    public void generateBill(SupermarketCustomer customer) {

        double totalAmount = 0;

        System.out.println("\nBilling for: " + customer.getCustomerName());

        for (ShoppingItem item : customer.getItemList()) {

            if (stockManager.isInStock(item.getItemName(), item.getQuantity())) {
                double price = stockManager.getPrice(item.getItemName());
                totalAmount += price * item.getQuantity();
                stockManager.updateStock(item.getItemName(), item.getQuantity());
            } else {
                System.out.println(item.getItemName() + " is out of stock");
            }
        }

        System.out.println("Total Bill Amount: ₹" + totalAmount);
    }
}
