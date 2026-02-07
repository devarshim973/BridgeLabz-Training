package com.Day6.ConversionLogicalQuestions;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetSorted {
	public static void main(String[] args) {

        Set<Integer> set = Set.of(5, 1, 3, 2, 4);
        List<Integer> list=set.stream()
        		.sorted()
        		.collect(Collectors.toList());
        System.out.println(list);
}
}