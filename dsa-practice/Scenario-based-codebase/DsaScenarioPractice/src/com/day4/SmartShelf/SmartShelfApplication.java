package com.day4.SmartShelf;

public class SmartShelfApplication {

    public static void main(String[] args) {

        BookRecord[] shelf = {
            new BookRecord("Algorithms", "CLRS"),
            new BookRecord("Data Structures", "Mark Allen"),
            new BookRecord("Java Programming", "Herbert Schildt"),
            new BookRecord("Operating Systems", "Silberschatz")
        };

        System.out.println("Before Sorting:");
        for (BookRecord book : shelf) {
            book.displayBook();
        }

        InsertionSortBookShelf sorter = new InsertionSortBookShelf();
        sorter.sortByTitle(shelf);

        System.out.println("\nAfter Sorting (Alphabetical by Title):");
        for (BookRecord book : shelf) {
            book.displayBook();
        }
    }
}
