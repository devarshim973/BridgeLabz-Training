package com.Collections.MapInterface.FindKeyHighestValue;

import java.util.HashMap;
import java.util.Map;

public class MaxValueKeyFinderApp {

    public static void main(String[] args) {

        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("A", 10);
        scoreMap.put("B", 20);
        scoreMap.put("C", 15);

        String resultKey = findKeyWithMaxValue(scoreMap);

        System.out.println("Key with highest value: " + resultKey);
    }

    // Method to find key with maximum value
    public static String findKeyWithMaxValue(Map<String, Integer> map) {

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}
