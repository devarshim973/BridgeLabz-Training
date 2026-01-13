package com.Day9.GameBox;

class StrategyGame extends BaseGame {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    @Override
    public void playDemo() {
        System.out.println(getTitle() +
            " demo: Tactical planning and resource management!");
    }
}
