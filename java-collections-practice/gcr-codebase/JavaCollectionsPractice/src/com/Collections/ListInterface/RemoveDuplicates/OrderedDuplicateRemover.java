package com.Collections.ListInterface.RemoveDuplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrderedDuplicateRemover {

    public static List<Integer> removeDuplicates(List<Integer> list) {

        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer value : list) {

            if (!seen.contains(value)) {
                seen.add(value);
                result.add(value);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Original List: " + numbers);

        List<Integer> output =
                removeDuplicates(numbers);

        System.out.println("After Removing Duplicates: " + output);
    }
}
