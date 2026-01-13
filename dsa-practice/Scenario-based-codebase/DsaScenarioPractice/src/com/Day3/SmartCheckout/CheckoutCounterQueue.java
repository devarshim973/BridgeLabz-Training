package com.Day3.SmartCheckout;

import java.util.LinkedList;
import java.util.Queue;

public class CheckoutCounterQueue {

    private Queue<SupermarketCustomer> customerQueue = new LinkedList<>();

    public void addCustomer(SupermarketCustomer customer) {
        customerQueue.offer(customer);
        System.out.println(customer.getCustomerName() + " added to queue");
    }

    public SupermarketCustomer removeCustomer() {
        return customerQueue.poll();
    }

    public boolean hasCustomers() {
        return !customerQueue.isEmpty();
    }
}
