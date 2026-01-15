package com.day4.SmartShelf;

public class InsertionSortBookShelf {

    public void sortByTitle(BookRecord[] books) {

        // Insertion Sort logic
        for (int i = 1; i < books.length; i++) {

            BookRecord keyBook = books[i];
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 &&
                   books[j].getTitle()
                       .compareToIgnoreCase(keyBook.getTitle()) > 0) {

                books[j + 1] = books[j];
                j--;
            }

            // Insert key book at correct position
            books[j + 1] = keyBook;
        }
    }
}
