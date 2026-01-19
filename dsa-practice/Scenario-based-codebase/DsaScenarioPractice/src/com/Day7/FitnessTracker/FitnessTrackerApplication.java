package com.Day7.FitnessTracker;

import java.util.ArrayList;
import java.util.List;

public class FitnessTrackerApplication {

    public static void main(String[] args) {

        List<FitnessUserRecord> users = new ArrayList<>();

        users.add(new FitnessUserRecord(1, "Aarav", 8500));
        users.add(new FitnessUserRecord(2, "Meera", 12000));
        users.add(new FitnessUserRecord(3, "Rohan", 9800));
        users.add(new FitnessUserRecord(4, "Ananya", 11000));

        FitnessRankingService.generateLeaderboard(users);
    }
}
