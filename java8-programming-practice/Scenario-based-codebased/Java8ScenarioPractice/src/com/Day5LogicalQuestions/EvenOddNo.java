package com.Day5LogicalQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNo {
public static void main(String[] args) {
	List<Integer> number=List.of(1,2,3,4,5,6);
	
	List<Integer>evenNum= number.stream()
	.filter(i->i%2==0)
	.collect(Collectors.toList());
	System.out.println(" evennum "+ evenNum);
	
	List<Integer>oddNum= number.stream()
			.filter(i->i%2!=0)
			.collect(Collectors.toList());
	System.out.println(" oddnum "+ oddNum);
		}
}

