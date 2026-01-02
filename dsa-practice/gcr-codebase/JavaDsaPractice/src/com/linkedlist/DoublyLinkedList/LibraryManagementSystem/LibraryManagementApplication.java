package com.linkedlist.DoublyLinkedList.LibraryManagementSystem;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtBeginning(101, "Java Basics", "James Gosling", "Programming", true);
        library.addAtEnd(102, "Clean Code", "Robert Martin", "Software", true);
        library.addAtEnd(103, "Data Structures", "Mark Allen", "CS", false);
        library.addAtPosition(2, 104, "Algorithms", "Thomas Cormen", "CS", true);

        library.displayForward();

        library.searchByAuthor("Robert Martin");

        library.updateAvailability(103, true);

        library.displayReverse();

        library.removeByBookId(101);

        library.countBooks();

        library.displayForward();
    }
}
