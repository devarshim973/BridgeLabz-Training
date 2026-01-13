package com.Day3.SmartCheckout;

public class SmartCheckoutApplication {

    public static void main(String[] args) {

        ItemStockManager stockManager = new ItemStockManager();
        stockManager.addItem("Milk", 50, 10);
        stockManager.addItem("Bread", 30, 5);

        SupermarketCustomer customer1 = new SupermarketCustomer("Rahul");
        customer1.addItem(new ShoppingItem("Milk", 2));
        customer1.addItem(new ShoppingItem("Bread", 1));

        CheckoutCounterQueue queue = new CheckoutCounterQueue();
        queue.addCustomer(customer1);

        BillingProcessor billingProcessor = new BillingProcessor(stockManager);

        while (queue.hasCustomers()) {
            SupermarketCustomer currentCustomer = queue.removeCustomer();
            billingProcessor.generateBill(currentCustomer);
        }
    }
}
