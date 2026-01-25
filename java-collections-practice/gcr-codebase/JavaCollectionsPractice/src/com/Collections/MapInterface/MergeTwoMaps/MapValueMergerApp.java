package com.Collections.MapInterface.MergeTwoMaps;

import java.util.HashMap;
import java.util.Map;

public class MapValueMergerApp {

    public static void main(String[] args) {

        Map<String, Integer> firstMap = new HashMap<>();
        firstMap.put("A", 1);
        firstMap.put("B", 2);

        Map<String, Integer> secondMap = new HashMap<>();
        secondMap.put("B", 3);
        secondMap.put("C", 4);

        Map<String, Integer> mergedMap = mergeMaps(firstMap, secondMap);

        System.out.println("Merged Map: " + mergedMap);
    }

    // Method to merge maps and sum values for duplicate keys
    public static Map<String, Integer> mergeMaps(
            Map<String, Integer> mapOne,
            Map<String, Integer> mapTwo) {

        Map<String, Integer> resultMap = new HashMap<>(mapOne);

        for (Map.Entry<String, Integer> entry : mapTwo.entrySet()) {

            resultMap.put(
                    entry.getKey(),
                    resultMap.getOrDefault(entry.getKey(), 0) + entry.getValue()
            );
        }

        return resultMap;
    }
}
