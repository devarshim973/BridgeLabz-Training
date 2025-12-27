package com.constructor;

public class Book {

    // Instance variables
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Not Available";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-------------------");
    }

    // Main method
    public static void main(String[] args) {

        // Using default constructor
        Book book1 = new Book();

        // Using parameterized constructor
        Book book2 = new Book("Wings of Fire", "A. P. J. Abdul Kalam", 450);

        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}

