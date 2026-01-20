package com.Day8.GamerZone;

import java.util.ArrayList;
import java.util.List;

class GamerZone {

    // Player class
    static class Player {
        String playerName;
        int score;

        Player(String playerName, int score) {
            this.playerName = playerName;
            this.score = score;
        }
    }

    // Quick Sort method
    public static void quickSort(List<Player> players, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(players, low, high);
            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }

    // Partition logic (Descending order for leaderboard)
    private static int partition(List<Player> players, int low, int high) {
        int pivot = players.get(high).score;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (players.get(j).score > pivot) { // higher score first
                i++;
                swap(players, i, j);
            }
        }

        swap(players, i + 1, high);
        return i + 1;
    }

    // Swap utility
    private static void swap(List<Player> players, int i, int j) {
        Player temp = players.get(i);
        players.set(i, players.get(j));
        players.set(j, temp);
    }

    // Display leaderboard
    public static void displayLeaderboard(List<Player> players) {
        for (Player p : players) {
            System.out.println(p.playerName + " -> " + p.score);
        }
    }

    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();

        players.add(new Player("Alex", 450));
        players.add(new Player("Bob", 780));
        players.add(new Player("Chris", 620));
        players.add(new Player("Diana", 900));
        players.add(new Player("Evan", 500));

        System.out.println("Before Sorting:");
        displayLeaderboard(players);

        quickSort(players, 0, players.size() - 1);

        System.out.println("\nLeaderboard (High to Low):");
        displayLeaderboard(players);
    }
}
