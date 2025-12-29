package com.constructor;

public class BookLibrarySystem {

    public static void main(String[] args) {

        Bookone book =
                new Bookone("978-0135166307", "Java Basics", "James Gosling");
        book.displayBookDetails();

        System.out.println("--------------------------");

        EBook ebook =
                new EBook("978-1492056270", "Effective Java", "Joshua Bloch", "PDF");
        ebook.displayEBookDetails();

        System.out.println("--------------------------");

        // Update author using setter
        ebook.setAuthor("J. Bloch");
        System.out.println("After updating author:");
        ebook.displayEBookDetails();
    }
}