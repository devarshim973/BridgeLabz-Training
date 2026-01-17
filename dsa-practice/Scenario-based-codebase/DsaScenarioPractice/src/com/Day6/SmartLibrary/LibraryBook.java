package com.Day6.SmartLibrary;

public class LibraryBook {

    private String title;
    private String author;

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}
