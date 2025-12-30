package com.objectModeling;

public class Book {

    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display book details
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
