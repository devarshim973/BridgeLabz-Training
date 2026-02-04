package com.Day5LogicalQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FIndTop {
public static void main(String[] args) {
	List<Integer> number= List.of(10,90,30,70,50);
	List<Integer> num= number.stream()
			.sorted(Comparator.reverseOrder())
			.limit(3)
			.collect(Collectors.toList());
	System.out.println(num);
			
}
}
