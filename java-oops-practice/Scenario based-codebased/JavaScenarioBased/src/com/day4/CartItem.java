package com.day4;

class CartItem {

    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    protected double calculateItemTotal() {
        return product.price * quantity; // operator used
    }

    protected double calculateDiscount() {
        return calculateItemTotal() * product.getDiscountRate();
    }
}
