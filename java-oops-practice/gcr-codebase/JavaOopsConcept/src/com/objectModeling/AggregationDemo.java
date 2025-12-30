package com.objectModeling;

public class AggregationDemo {

    public static void main(String[] args) {

        // Books can exist independently
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("Effective Java", "Joshua Bloch");

        // Libraries
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        // Adding books to libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); // same book in another library

        // Display
        lib1.showBooks();
        lib2.showBooks();
    }
}

