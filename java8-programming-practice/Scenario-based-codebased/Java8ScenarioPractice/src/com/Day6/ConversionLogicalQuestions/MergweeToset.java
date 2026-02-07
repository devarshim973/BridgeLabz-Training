package com.Day6.ConversionLogicalQuestions;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergweeToset {
	 public static void main(String[] args) {

	        List<Integer> list1 = List.of(1, 2, 3);
	        List<Integer> list2 = List.of(3, 4, 5);

	        Set<Integer> set =
	                Stream.concat(list1.stream(), list2.stream())
	                      .collect(Collectors.toSet());

	        System.out.println(set);
	    }
}
