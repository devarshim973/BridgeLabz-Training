package com.Collections.ListInterface.FindFrequencyofElements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class StringFrequencyCounter {

    public static Map<String, Integer> countFrequency(List<String> items) {

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : items) {

            if (frequencyMap.containsKey(item)) {
                frequencyMap.put(
                        item,
                        frequencyMap.get(item) + 1
                );
            } else {
                frequencyMap.put(item, 1);
            }
        }
        return frequencyMap;
    }

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");

        Map<String, Integer> result =
                countFrequency(fruits);

        System.out.println(result);
    }
}
