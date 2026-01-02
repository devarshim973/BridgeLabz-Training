package com.linkedlist.DoublyLinkedList.LibraryManagementSystem;

public class LibraryDoublyLinkedList {

    private LibraryBookNode head;
    private LibraryBookNode tail;
    private int totalBooks;

    public LibraryDoublyLinkedList() {
        head = null;
        tail = null;
        totalBooks = 0;
    }

    // Add book at beginning
    public void addAtBeginning(int id, String title, String author, String genre, boolean status) {
        LibraryBookNode newNode = new LibraryBookNode(id, title, author, genre, status);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        totalBooks++;
    }

    // Add book at end
    public void addAtEnd(int id, String title, String author, String genre, boolean status) {
        LibraryBookNode newNode = new LibraryBookNode(id, title, author, genre, status);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        totalBooks++;
    }

    // Add book at specific position
    public void addAtPosition(int position, int id, String title, String author, String genre, boolean status) {
        if (position <= 1) {
            addAtBeginning(id, title, author, genre, status);
            return;
        }

        LibraryBookNode temp = head;
        int index = 1;

        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(id, title, author, genre, status);
            return;
        }

        LibraryBookNode newNode = new LibraryBookNode(id, title, author, genre, status);
        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;

        totalBooks++;
    }

    // Remove book by ID
    public void removeByBookId(int bookId) {
        LibraryBookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {

                if (temp == head) {
                    head = head.next;
                    if (head != null)
                        head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                totalBooks--;
                System.out.println("Book removed successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // Update availability status
    public void updateAvailability(int bookId, boolean status) {
        LibraryBookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                System.out.println("Availability status updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // Search by title
    public void searchByTitle(String title) {
        LibraryBookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No book found with this title");
    }

    // Search by author
    public void searchByAuthor(String author) {
        LibraryBookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No books found by this author");
    }

    // Display forward
    public void displayForward() {
        LibraryBookNode temp = head;
        System.out.println("Library Books (Forward Order):");

        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        LibraryBookNode temp = tail;
        System.out.println("Library Books (Reverse Order):");

        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count books
    public void countBooks() {
        System.out.println("Total books in library: " + totalBooks);
    }

    private void displayBook(LibraryBookNode book) {
        System.out.println(
                "ID: " + book.bookId +
                ", Title: " + book.title +
                ", Author: " + book.author +
                ", Genre: " + book.genre +
                ", Available: " + book.isAvailable
        );
    }
}
