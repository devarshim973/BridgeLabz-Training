package com.HashMapsHashFunctions.TwoSumProblem;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIndexFinder {

    public int[] findTwoSumIndices(int[] numbers, int target) {

        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int requiredValue = target - numbers[i];

            // Check if complement exists
            if (indexMap.containsKey(requiredValue)) {
                return new int[]{indexMap.get(requiredValue), i};
            }

            // Store current number with its index
            indexMap.put(numbers[i], i);
        }

        return new int[]{-1, -1}; // No solution
    }
}
