package com.Day8.ArtifyDigitalArtMarketplace;

abstract class BaseArtworkItem implements PurchasableArtPolicy {

    private String title;
    private String artist;
    private double price;
    protected String licenseType;   // protected as per requirement
    private boolean hasPreview;

    // Constructor with preview
    public BaseArtworkItem(String title, String artist,
                           double price, String licenseType,
                           boolean hasPreview) {

        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.hasPreview = hasPreview;
    }

    // Constructor without preview
    public BaseArtworkItem(String title, String artist,
                           double price, String licenseType) {
        this(title, artist, price, licenseType, false);
    }

    public String getTitle() {
        return title;
    }

    protected double getPrice() {
        return price;
    }

    // Purchase logic (common)
    public void purchase(MarketplaceUserProfile user) {

        if (user.deductAmount(price)) {
            System.out.println(
                user.getName() + " purchased \"" + title + "\" for ₹" + price
            );
        } else {
            System.out.println(
                user.getName() + " has insufficient wallet balance."
            );
        }
    }

    // Polymorphic licensing
    public abstract void licenseArt(MarketplaceUserProfile user);
}
