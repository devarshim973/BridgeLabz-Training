package com.Day1;

public class StoreBook {

    private String title;
    private String author;
    private double price;

    public StoreBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
