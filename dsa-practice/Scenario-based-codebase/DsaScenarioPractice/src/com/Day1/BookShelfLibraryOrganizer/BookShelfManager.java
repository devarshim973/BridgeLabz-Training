package com.Day1.BookShelfLibraryOrganizer;

import java.util.*;

class BookShelfManager {

    // Genre → List of Books
    private Map<String, LinkedList<LibraryBook>> genreCatalog;

    // Stores ISBNs to prevent duplication
    private Set<String> uniqueBookSet;

    public BookShelfManager() {
        genreCatalog = new HashMap<>();
        uniqueBookSet = new HashSet<>();
    }

    // Add book to library
    public void addBook(String genre, LibraryBook book) {

        // Avoid duplicate books
        if (uniqueBookSet.contains(book.getIsbn())) {
            System.out.println("Duplicate book not allowed: " + book.getIsbn());
            return;
        }

        // Get or create genre list
        genreCatalog.putIfAbsent(genre, new LinkedList<>());

        genreCatalog.get(genre).add(book);
        uniqueBookSet.add(book.getIsbn());

        System.out.println("Book added to genre: " + genre);
    }

    // Borrow book (remove)
    public void borrowBook(String genre, String isbn) {

        LinkedList<LibraryBook> books = genreCatalog.get(genre);

        if (books == null) {
            System.out.println("Genre not found");
            return;
        }

        Iterator<LibraryBook> iterator = books.iterator();

        while (iterator.hasNext()) {
            LibraryBook book = iterator.next();
            if (book.getIsbn().equals(isbn)) {
                iterator.remove();
                uniqueBookSet.remove(isbn);
                System.out.println("Book borrowed: " + isbn);
                return;
            }
        }

        System.out.println("Book not available");
    }

    // Display library
    public void displayCatalog() {

        for (String genre : genreCatalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (LibraryBook book : genreCatalog.get(genre)) {
                System.out.println(" - " + book.getBookDetails());
            }
        }
    }
}
