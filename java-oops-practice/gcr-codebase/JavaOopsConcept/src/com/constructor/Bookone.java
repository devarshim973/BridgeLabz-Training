package com.constructor;

public class Bookone {

    // Access modifiers
    public String ISBN;        // accessible everywhere
    protected String title;    // accessible in subclass
    private String author;     // accessible only inside this class

    // Constructor
    Bookone(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for private variable author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for private variable author
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }
}