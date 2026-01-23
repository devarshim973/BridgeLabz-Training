package com.Day10.GamingApp;

public class GameApp {

    public static void main(String[] args) {

        AVLLeaderboard leaderboard = new AVLLeaderboard();

        // Scenario 1: Insert / Update players
        leaderboard.addOrUpdatePlayer("Alex", 1200);
        leaderboard.addOrUpdatePlayer("Bob", 1800);
        leaderboard.addOrUpdatePlayer("Chris", 1500);
        leaderboard.addOrUpdatePlayer("David", 2000);
        leaderboard.addOrUpdatePlayer("Eva", 1700);

        // Scenario 2: Display top players
        leaderboard.displayTopPlayers();
    }
}
