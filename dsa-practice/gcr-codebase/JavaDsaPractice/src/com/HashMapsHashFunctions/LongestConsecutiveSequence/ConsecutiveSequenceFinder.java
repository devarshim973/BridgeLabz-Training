package com.HashMapsHashFunctions.LongestConsecutiveSequence;

import java.util.HashMap;
import java.util.Map;

public class ConsecutiveSequenceFinder {

    public int findLongestConsecutiveSequence(int[] array) {

        Map<Integer, Boolean> numberMap = new HashMap<>();

        // Step 1: Store all elements in HashMap
        for (int value : array) {
            numberMap.put(value, true);
        }

        int longestLength = 0;

        // Step 2: Check each number as a sequence start
        for (int value : array) {

            // Start sequence only if previous number does not exist
            if (!numberMap.containsKey(value - 1)) {

                int currentNumber = value;
                int currentLength = 1;

                // Step 3: Count consecutive numbers
                while (numberMap.containsKey(currentNumber + 1)) {
                    currentNumber++;
                    currentLength++;
                }

                // Step 4: Update maximum length
                longestLength = Math.max(longestLength, currentLength);
            }
        }

        return longestLength;
    }
}
