package com.Day5LogicalQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxNumber {
	public static void main(String[] args) {
		List<Integer> number=List.of(10,25,3,99,45);
		Optional<Integer> num= number.stream()
				.max(Integer::compareTo);
		System.out.println(num);
		
}
}