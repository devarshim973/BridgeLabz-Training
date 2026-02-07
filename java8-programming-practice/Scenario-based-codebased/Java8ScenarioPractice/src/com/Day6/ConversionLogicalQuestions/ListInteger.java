package com.Day6.ConversionLogicalQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListInteger {
	public static void main(String[] args) {
		List<Integer> word= List.of(2,3,4,5);
		word.stream()
		.map(n->n*n)
		.forEach(System.out::println);
		
	}
}
