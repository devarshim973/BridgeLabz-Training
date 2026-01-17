package com.Day6.SmartLibrary;

import java.util.ArrayList;
import java.util.List;

public class SmartLibraryManager {

    private List<LibraryBook> borrowedBooks = new ArrayList<>();

    // Add a new book and maintain sorted order by title
    public void borrowBook(LibraryBook book) {
        borrowedBooks.add(book);
        insertionSort();
    }

    // Insertion Sort by book title
    private void insertionSort() {
        for (int i = 1; i < borrowedBooks.size(); i++) {
            LibraryBook key = borrowedBooks.get(i);
            int j = i - 1;

            while (j >= 0 && borrowedBooks.get(j).getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
                borrowedBooks.set(j + 1, borrowedBooks.get(j));
                j--;
            }
            borrowedBooks.set(j + 1, key);
        }
    }

    // Display borrowed books
    public void displayBorrowedBooks() {
        System.out.println("Borrowed Books (Alphabetically Sorted):");
        for (LibraryBook book : borrowedBooks) {
            System.out.println(book);
        }
    }
}
