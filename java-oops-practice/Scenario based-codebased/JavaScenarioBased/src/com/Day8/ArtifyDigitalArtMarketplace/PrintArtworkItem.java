package com.Day8.ArtifyDigitalArtMarketplace;

class PrintArtworkItem extends BaseArtworkItem {

    public PrintArtworkItem(String title, String artist,
                            double price, String licenseType,
                            boolean hasPreview) {
        super(title, artist, price, licenseType, hasPreview);
    }

    public PrintArtworkItem(String title, String artist,
                            double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    @Override
    public void licenseArt(MarketplaceUserProfile user) {
        System.out.println(
            "Print License issued to " + user.getName() +
            ". Reproduction rights are restricted."
        );
    }
}
