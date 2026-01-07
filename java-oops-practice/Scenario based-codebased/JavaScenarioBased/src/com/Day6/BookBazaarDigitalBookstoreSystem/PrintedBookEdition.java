package com.Day6.BookBazaarDigitalBookstoreSystem;

class PrintedBookEdition extends BookBaseItem {

    public PrintedBookEdition(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        // Buy 2 get 5% discount
        if (quantity >= 2) {
            return price * quantity * 0.05;
        }
        return 0;
    }
}
