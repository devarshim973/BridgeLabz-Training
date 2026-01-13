package com.Day9.GameBox;

class ArcadeGame extends BaseGame {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    @Override
    public void playDemo() {
        System.out.println(getTitle() + 
            " demo: Fast-paced action with quick levels!");
    }
}
