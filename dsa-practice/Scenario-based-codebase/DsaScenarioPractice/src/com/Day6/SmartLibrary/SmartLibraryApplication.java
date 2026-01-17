package com.Day6.SmartLibrary;

public class SmartLibraryApplication {

    public static void main(String[] args) {

        SmartLibraryManager libraryManager = new SmartLibraryManager();

        // Borrowing books (dynamic insertion)
        libraryManager.borrowBook(new LibraryBook("The Great Gatsby", "F. Scott Fitzgerald"));
        libraryManager.borrowBook(new LibraryBook("To Kill a Mockingbird", "Harper Lee"));
        libraryManager.borrowBook(new LibraryBook("1984", "George Orwell"));
        libraryManager.borrowBook(new LibraryBook("Brave New World", "Aldous Huxley"));
        libraryManager.borrowBook(new LibraryBook("Animal Farm", "George Orwell"));

        // Display borrowed books sorted alphabetically
        libraryManager.displayBorrowedBooks();
    }
}
