package com.Day6.ConversionLogicalQuestions;


import java.util.List;
import java.util.List.*;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfString {
public static void main(String[] args) {
	List<String> word= List.of("Java", "Python", "C++", "Spring");
	Map<String,Integer> map= word.stream()
			.collect(Collectors.toMap(s->s,s->s.length()));
	System.out.println(map);
}
}
