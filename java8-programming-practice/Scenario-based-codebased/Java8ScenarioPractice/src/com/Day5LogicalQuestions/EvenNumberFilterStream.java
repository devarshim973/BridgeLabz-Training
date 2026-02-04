package com.Day5LogicalQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFilterStream {
public static void main(String[] args) {
	
	
	List<Integer> number = List.of(2, 5, 7, 8, 10, 13);
 number.stream()
			.filter(i->i%2==0)
			.collect(Collectors.toList())
	.forEach(System.out::println);
	
}
}
