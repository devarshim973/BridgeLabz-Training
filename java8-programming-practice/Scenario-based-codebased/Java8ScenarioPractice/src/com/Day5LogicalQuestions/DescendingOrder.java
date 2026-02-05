package com.Day5LogicalQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {
public static void main(String[] args) {
	List<Integer> number=List.of(5,1,9,3);
	number.stream()
	.sorted()
	.collect(Collectors.toList())
	.forEach(System.out::println);
}
}
