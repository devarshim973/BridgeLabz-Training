package com.Collections.ImplementaShoppingCart;

public class ShoppingCartApplication {

    public static void main(String[] args) {

        ShoppingCartManagerService cartManager = new ShoppingCartManagerService();

        cartManager.addProduct(new ShoppingProductItem("Laptop", 1200));
        cartManager.addProduct(new ShoppingProductItem("Mouse", 25));
        cartManager.addProduct(new ShoppingProductItem("Keyboard", 45));
        cartManager.addProduct(new ShoppingProductItem("Monitor", 300));
        cartManager.addProduct(new ShoppingProductItem("USB Cable", 25));

        // Display products in different ways
        cartManager.displayPriceMap();
        cartManager.displayCartOrder();
        cartManager.displayProductsByPrice();
    }
}
