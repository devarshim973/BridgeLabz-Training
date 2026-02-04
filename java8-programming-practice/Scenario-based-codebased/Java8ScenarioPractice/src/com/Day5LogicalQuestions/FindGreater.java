package com.Day5LogicalQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class FindGreater {
public static void main(String[] args) {
	List<Integer> num= List.of(10,55,60,23,90);
	num.stream()
	.filter(i->i>50)
	.collect(Collectors.toList())
	.forEach(System.out::println);
	
}
}
