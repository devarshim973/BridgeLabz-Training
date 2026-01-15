package com.day4.SmartShelf;

public class BookRecord {

    private String title;
    private String author;

    public BookRecord(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
