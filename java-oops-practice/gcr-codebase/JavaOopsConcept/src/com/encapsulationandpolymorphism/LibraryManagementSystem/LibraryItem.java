package com.encapsulationandpolymorphism.LibraryManagementSystem;

public abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    // Sensitive borrower data (encapsulation)
    private String borrowerName;
    private boolean available = true;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Encapsulation: getters only
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Controlled access to borrower data
    protected void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
        this.available = false;
    }

    protected void clearBorrower() {
        this.borrowerName = null;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println(
                "ID: " + itemId +
                ", Title: " + title +
                ", Author: " + author +
                ", Available: " + available
        );
    }
}
