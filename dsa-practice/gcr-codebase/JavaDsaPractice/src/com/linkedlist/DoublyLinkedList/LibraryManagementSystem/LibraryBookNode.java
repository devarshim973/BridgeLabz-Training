package com.linkedlist.DoublyLinkedList.LibraryManagementSystem;

public class LibraryBookNode {

    int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable;

    LibraryBookNode next;
    LibraryBookNode prev;

    public LibraryBookNode(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}
