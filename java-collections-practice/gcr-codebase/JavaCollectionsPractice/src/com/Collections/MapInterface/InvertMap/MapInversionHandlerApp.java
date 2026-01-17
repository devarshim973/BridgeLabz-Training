package com.Collections.MapInterface.InvertMap;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class MapInversionHandlerApp {

    public static void main(String[] args) {

        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        Map<Integer, List<String>> invertedMap = invertMap(originalMap);

        System.out.println("Inverted Map: " + invertedMap);
    }

    // Method to invert map and handle duplicate values
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> inputMap) {

        Map<V, List<K>> resultMap = new HashMap<>();

        for (Map.Entry<K, V> entry : inputMap.entrySet()) {

            V value = entry.getValue();
            K key = entry.getKey();

            resultMap
                .computeIfAbsent(value, k -> new ArrayList<>())
                .add(key);
        }

        return resultMap;
    }
}
