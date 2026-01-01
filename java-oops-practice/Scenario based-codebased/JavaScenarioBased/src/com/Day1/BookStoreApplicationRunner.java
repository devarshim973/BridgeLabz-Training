package com.Day1;

public class BookStoreApplicationRunner {

    public static void main(String[] args) {

        StoreBook bookOne =
                new StoreBook("Java Basics", "James", 450);

        StoreBook bookTwo =
                new StoreBook("Advanced Java", "James", 650);

        StoreBook bookThree =
                new StoreBook("Python Intro", "Guido", 500);

        ShoppingCartContainer cart = new ShoppingCartContainer();
        cart.addBook(bookOne);
        cart.addBook(bookTwo);

        AuthorBookOrganizer organizer = new AuthorBookOrganizer();
        organizer.addBook(bookOne);
        organizer.addBook(bookTwo);
        organizer.addBook(bookThree);

        UniqueAuthorTracker tracker = new UniqueAuthorTracker();
        tracker.registerAuthor("James");
        tracker.registerAuthor("Guido");

        OrderSummaryBuilder summaryBuilder = new OrderSummaryBuilder();
        System.out.println(summaryBuilder.buildSummary(cart.getCartItems()));
    }
}
