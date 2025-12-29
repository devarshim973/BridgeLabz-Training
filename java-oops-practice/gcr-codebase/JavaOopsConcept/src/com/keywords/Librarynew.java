package com.keywords;

public class Librarynew {

    public static void main(String[] args) {

        // Set the library name (static variable)
        Booknew.setLibraryName("Egmore Library");

        // Display the library name
        Booknew.displayLibraryName();

        // Create a new book instance
        Booknew book1 =
                new Booknew("Effective Java", "Joshua Bloch", "978-0134685991");

        // Display book details
        book1.displayBookDetails();
    }
}