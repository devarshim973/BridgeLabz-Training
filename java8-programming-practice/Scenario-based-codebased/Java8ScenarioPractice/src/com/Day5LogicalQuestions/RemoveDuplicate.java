package com.Day5LogicalQuestions;

import java.util.List;

public class RemoveDuplicate {
public static void main(String[] args) {
	List<Integer> number=List.of(1,2,2,3,4,4,5);
	number.stream()
	.distinct()
	.forEach(System.out::println);
}
}
