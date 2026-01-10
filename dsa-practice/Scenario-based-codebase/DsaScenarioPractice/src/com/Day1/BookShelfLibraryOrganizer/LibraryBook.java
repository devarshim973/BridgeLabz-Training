package com.Day1.BookShelfLibraryOrganizer;

class LibraryBook {

    private String isbn;
    private String title;
    private String author;

    public LibraryBook(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBookDetails() {
        return title + " by " + author;
    }
}
