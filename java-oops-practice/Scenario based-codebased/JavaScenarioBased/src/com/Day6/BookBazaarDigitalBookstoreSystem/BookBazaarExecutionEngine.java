package com.Day6.BookBazaarDigitalBookstoreSystem;

class BookBazaarExecutionEngine {

    public static void main(String[] args) {

        BookBaseItem book1 =
                new PrintedBookEdition("Clean Code", "Robert Martin", 500, 10);

        BookBaseItem book2 =
                new EBookEdition("Java in Depth", "Herbert Schildt", 400);

        BookOrderTransaction order =
                new BookOrderTransaction("Amit");

        double totalAmount = order.placeOrder(book1, 2);

        System.out.println("Order Status: " + order.getOrderStatus());
        System.out.println("Total Payable Amount: " + totalAmount);
        System.out.println("Remaining Stock: " + book1.getStock());
    }
}
