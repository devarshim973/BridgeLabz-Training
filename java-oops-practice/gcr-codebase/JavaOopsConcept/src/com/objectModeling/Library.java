package com.objectModeling;

import java.util.ArrayList;   // ✅ REQUIRED IMPORT

public class Library {

    String libraryName;
    ArrayList<Book> books;

    // Constructor
    Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    // Add book to library
    void addBook(Book book) {
        books.add(book);
    }

    // Display books in library
    void showBooks() {
        System.out.println("\nBooks in " + libraryName + ":");
        for (Book b : books) {
            b.displayBook();
        }
    }
}

