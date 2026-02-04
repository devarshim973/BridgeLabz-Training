package com.Day5LogicalQuestions;

import java.util.List;

public class SumNumber {
public static void main(String[] args) {
	List<Integer> number=List.of(1,2,3,4,5);
	int num= number.stream()
			.reduce(0, (a,b)->a+b);
	System.out.println(num);
}
}
