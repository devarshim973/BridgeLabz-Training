package com.Day8.ArtifyDigitalArtMarketplace;

class DigitalArtworkItem extends BaseArtworkItem {

    public DigitalArtworkItem(String title, String artist,
                              double price, String licenseType,
                              boolean hasPreview) {
        super(title, artist, price, licenseType, hasPreview);
    }

    public DigitalArtworkItem(String title, String artist,
                              double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    @Override
    public void licenseArt(MarketplaceUserProfile user) {
        System.out.println(
            "Digital License granted to " + user.getName() +
            " under " + licenseType + " license."
        );
    }
}
