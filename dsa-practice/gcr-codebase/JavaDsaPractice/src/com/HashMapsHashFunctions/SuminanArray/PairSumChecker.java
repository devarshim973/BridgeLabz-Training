package com.HashMapsHashFunctions.SuminanArray;

import java.util.HashMap;
import java.util.Map;

public class PairSumChecker {

    public boolean hasPairWithSum(int[] array, int targetSum) {

        Map<Integer, Boolean> visitedNumbers = new HashMap<>();

        for (int number : array) {

            int requiredValue = targetSum - number;

            // Check if the required value already exists
            if (visitedNumbers.containsKey(requiredValue)) {
                System.out.println(
                    "Pair found: (" + requiredValue + ", " + number + ")"
                );
                return true;
            }

            // Store current number as visited
            visitedNumbers.put(number, true);
        }

        System.out.println("No pair found with the given sum");
        return false;
    }
}
