package com.Day5LogicalQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 1);
        map.put("C", 2);

        Map<String, Integer> sortedMap =
                map.entrySet()
                   .stream()
                   .sorted(Map.Entry.comparingByValue()) // Step 1: sort by value
                   .collect(Collectors.toMap(
                           Map.Entry::getKey,
                           Map.Entry::getValue,
                           (e1, e2) -> e1,
                           LinkedHashMap::new             // Step 2: maintain order
                   ));

        System.out.println(sortedMap);
    }
}
