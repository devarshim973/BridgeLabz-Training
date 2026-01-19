package com.Day7.FitnessTracker;

import java.util.List;

public class FitnessRankingService {

    public static void generateLeaderboard(List<FitnessUserRecord> users) {

        BubbleSortStepEngine.bubbleSort(users);

        System.out.println("🏆 Daily Fitness Leaderboard");
        int rank = 1;

        for (FitnessUserRecord user : users) {
            System.out.println("Rank " + rank++ + ": " + user);
        }
    }
}
