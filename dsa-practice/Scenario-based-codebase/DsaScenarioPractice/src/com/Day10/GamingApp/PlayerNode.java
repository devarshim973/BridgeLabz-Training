package com.Day10.GamingApp;

class PlayerNode {
    String playerName;
    int score;
    int height;
    PlayerNode left, right;

    PlayerNode(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
        this.height = 1;
    }
}
