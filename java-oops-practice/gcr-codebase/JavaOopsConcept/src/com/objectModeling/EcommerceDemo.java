package com.objectModeling;

public class EcommerceDemo {
    public static void main(String[] args) {

        // Products
        Product p1 = new Product("Mobile", 15000);
        Product p2 = new Product("Headphones", 2000);

        Product[] productList = { p1, p2 };

        // Order
        Order order1 = new Order(101, productList);

        // Customer
        CustomerOne customer1 = new CustomerOne("Rohit");

        // Communication
        customer1.placeOrder(order1);
    }
}