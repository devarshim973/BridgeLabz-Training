package com.Day9.GameBox;

class GameBoxExecutionEngine {

    public static void main(String[] args) {

        BaseGame arcade =
                new ArcadeGame("Speed Blaster", 500, 4.5);

        BaseGame strategy =
                new StrategyGame("Empire Builder", 800, 4.8);

        // Polymorphism
        arcade.playDemo();
        strategy.playDemo();

        // Seasonal discount
        strategy.applySeasonalDiscount(20);

        GameBoxUser user = new GameBoxUser("aman");

        user.purchaseGame(arcade);
        user.purchaseGame(strategy);

        arcade.download();
        strategy.download();

        user.showOwnedGames();
    }
}
