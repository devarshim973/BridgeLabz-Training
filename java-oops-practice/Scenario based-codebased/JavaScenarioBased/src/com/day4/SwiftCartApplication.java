package com.day4;

public class SwiftCartApplication {

    public static void main(String[] args) {

        Product milk =
                new PerishableProduct("Milk", 50);

        Product rice =
                new NonPerishableProduct("Rice", 60);

        Cart cart = new Cart();

        cart.addItem(milk, 2);   // price * quantity
        cart.addItem(rice, 5);

        cart.printSummary();
    }
}
