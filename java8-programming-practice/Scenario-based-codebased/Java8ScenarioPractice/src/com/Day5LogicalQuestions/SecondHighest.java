package com.Day5LogicalQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondHighest {
public static void main(String[] args) {
	List<Integer> number=List.of(10,40,30,20);
	
	Optional<Integer> num= number.stream()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst();
	System.out.println(num);
	
}
}
