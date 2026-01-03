package com.HashMapsHashFunctions.ZeroSumSubarrayFinder;

import java.util.*;

public class ZeroSumSubarrayFinder {

    public void findZeroSumSubarrays(int[] array) {

        // Map to store cumulative sum and list of indices
        Map<Integer, List<Integer>> sumIndexMap = new HashMap<>();

        int cumulativeSum = 0;

        // Initialize map with sum = 0 at index -1
        sumIndexMap.put(0, new ArrayList<>(List.of(-1)));

        for (int i = 0; i < array.length; i++) {

            cumulativeSum += array[i];

            // If cumulative sum already exists, zero-sum subarray found
            if (sumIndexMap.containsKey(cumulativeSum)) {

                for (int startIndex : sumIndexMap.get(cumulativeSum)) {
                    System.out.println(
                        "Zero-sum subarray found from index "
                        + (startIndex + 1) + " to " + i
                    );
                }
            }

            // Store index for this cumulative sum
            sumIndexMap
                .computeIfAbsent(cumulativeSum, k -> new ArrayList<>())
                .add(i);
        }
    }
}
