package com.Day1.BookShelfLibraryOrganizer;

class BookShelfExecutionEngine {

    public static void main(String[] args) {

        BookShelfManager manager = new BookShelfManager();

        LibraryBook book1 =
            new LibraryBook("ISBN101", "Java Basics", "James Gosling");

        LibraryBook book2 =
            new LibraryBook("ISBN102", "Clean Code", "Robert Martin");

        LibraryBook book3 =
            new LibraryBook("ISBN103", "Data Structures", "Mark Allen");

        manager.addBook("Programming", book1);
        manager.addBook("Programming", book2);
        manager.addBook("Computer Science", book3);

        // Duplicate attempt
        manager.addBook("Programming", book1);

        manager.displayCatalog();

        manager.borrowBook("Programming", "ISBN102");

        manager.displayCatalog();
    }
}
