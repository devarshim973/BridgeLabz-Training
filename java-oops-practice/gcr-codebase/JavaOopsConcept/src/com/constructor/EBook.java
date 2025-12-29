package com.constructor;

class EBook extends Bookone {

    String format;

    // Constructor
    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    // Method to demonstrate access modifiers
    public void displayEBookDetails() {
        System.out.println("ISBN   : " + ISBN);        // public access
        System.out.println("Title  : " + title);       // protected access
        System.out.println("Author : " + getAuthor()); // private via getter
        System.out.println("Format : " + format);
    }
}
