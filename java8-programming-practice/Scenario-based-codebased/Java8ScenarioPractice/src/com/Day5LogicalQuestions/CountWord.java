package com.Day5LogicalQuestions;

import java.util.Map;
import java.util.stream.Collectors;

public class CountWord {
public static void main(String[] args) {
	String input="java is java and java is fast";
	Map<String,Long> map=java.util.Arrays.stream(input.split("\\s+"))
			.collect(Collectors.groupingBy(
					i->i,Collectors.counting()));
			System.out.println(map);
}
}
