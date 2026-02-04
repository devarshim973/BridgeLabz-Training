package com.Day5LogicalQuestions;

import java.util.List;
import java.util.Optional;

public class KthSmallestElement {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(9, 1, 5, 3, 7);
        int k = 2; // kth smallest

        Optional<Integer> kthSmallest = numbers.stream()
                                               .sorted() // ascending order
                                               .skip(k - 1) // skip first k-1 elements
                                               .findFirst(); // pick kth element

        System.out.println(kthSmallest.orElse(null));
    }
}
