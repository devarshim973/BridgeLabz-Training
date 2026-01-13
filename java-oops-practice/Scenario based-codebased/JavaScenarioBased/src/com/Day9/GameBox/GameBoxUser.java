package com.Day9.GameBox;

import java.util.ArrayList;
import java.util.List;

class GameBoxUser {

    private String userName;
    private List<BaseGame> ownedGames;

    public GameBoxUser(String userName) {
        this.userName = userName;
        this.ownedGames = new ArrayList<>();
    }

    // Controlled ownership
    public void purchaseGame(BaseGame game) {
        ownedGames.add(game);
        System.out.println(userName + " purchased " + game.getTitle());
    }

    public void showOwnedGames() {
        System.out.println("Owned Games:");
        for (BaseGame game : ownedGames) {
            System.out.println("- " + game.getTitle());
        }
    }
}
