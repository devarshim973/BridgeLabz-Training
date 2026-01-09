package com.Day8.ArtifyDigitalArtMarketplace;

class ArtifyExecutionEngine {

    public static void main(String[] args) {

        MarketplaceUserProfile user =
            new MarketplaceUserProfile("Aarav", 5000);

        BaseArtworkItem digitalArt =
            new DigitalArtworkItem(
                "Cyber Dreams", "Neha Rao",
                2000, "Commercial", true);

        BaseArtworkItem printArt =
            new PrintArtworkItem(
                "Sunset Canvas", "Rohit Mehta",
                1500, "Personal");

        System.out.println("---- ART PURCHASE ----");
        digitalArt.purchase(user);
        digitalArt.licenseArt(user);

        System.out.println();

        printArt.purchase(user);
        printArt.licenseArt(user);

        System.out.println("\nRemaining Wallet Balance: ₹" +
            user.getWalletBalance());
    }
}

