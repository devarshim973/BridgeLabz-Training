package com.Day6.BookBazaarDigitalBookstoreSystem;

class BookOrderTransaction {

    private String customerName;
    private String orderStatus; // restricted update

    public BookOrderTransaction(String customerName) {
        this.customerName = customerName;
        this.orderStatus = "CREATED";
    }

    // Only internal system can update status
    protected void updateOrderStatus(String status) {
        this.orderStatus = status;
    }

    public double placeOrder(BookBaseItem book, int quantity) {

        double discount = book.applyDiscount(quantity);
        double totalCost = (book.getPrice() * quantity) - discount;

        book.reduceStock(quantity);
        updateOrderStatus("CONFIRMED");

        return totalCost;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}
