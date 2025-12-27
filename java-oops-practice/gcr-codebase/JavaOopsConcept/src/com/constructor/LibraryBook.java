package com.constructor;

public class LibraryBook {

    // Instance variables
    String title;
    String author;
    double price;
    boolean available;

    // Parameterized constructor
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; // book is available initially
    }

    // Method to borrow the book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : " + price);
        System.out.println("Available  : " + available);
        System.out.println("-----------------------");
    }

    // Main method
    public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook("Wings of Fire", "A.P.J Abdul Kalam", 450);

        book1.displayBook();
        book1.borrowBook();
        book1.borrowBook(); // borrowing again
        book1.displayBook();
    }
}
