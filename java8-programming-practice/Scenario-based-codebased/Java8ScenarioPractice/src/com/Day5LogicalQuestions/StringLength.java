package com.Day5LogicalQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringLength {
public static void main(String[] args) {
	List<String> word=List.of("a","bb","ccc","dd");
	
	Map<Integer,List<String>> sum= word.stream()
			.collect(Collectors.groupingBy(String::length));
	System.out.println(sum);
}
}
