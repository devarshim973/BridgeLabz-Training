package com.Day6.BookBazaarDigitalBookstoreSystem;

abstract class BookBaseItem implements DiscountPolicy {

    protected String title;
    protected String author;
    protected double price;

    private int stock; // encapsulated inventory

    public BookBaseItem(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Controlled stock reduction
    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            throw new IllegalArgumentException("Insufficient stock available");
        }
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }
}
