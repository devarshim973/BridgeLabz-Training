package com.Day5LogicalQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class ListIntListStr {
public static void main(String[] args) {
	List<Integer> num= List.of(1,2,3);
	String sum= num.stream()
			.map(String::valueOf)
			.collect(Collectors.joining(","));
	System.out.println(sum);
}
}
