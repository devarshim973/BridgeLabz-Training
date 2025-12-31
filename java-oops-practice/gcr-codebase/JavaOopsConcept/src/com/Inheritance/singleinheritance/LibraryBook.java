package com.Inheritance.singleinheritance;

public class LibraryBook {
    String title;
    int publicationYear;

    public LibraryBook(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book info
    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}