package com.Inheritance.singleinheritance;

public class BookAuthor extends LibraryBook {
    String authorName;
    String bio;

    public BookAuthor(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    // Override displayInfo() to include author details
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + authorName);
        System.out.println("Author Bio: " + bio);
    }
}
