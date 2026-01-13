package com.Day9.GameBox;

abstract class BaseGame implements IDownloadable {

    private String title;
    private String genre;
    protected double price;
    private double rating;

    protected BaseGame(String title, String genre,
                       double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Encapsulated getters
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    // Seasonal offer using operator
    public void applySeasonalDiscount(double discountPercent) {
        price = price - (price * discountPercent / 100);
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully.");
    }
}
