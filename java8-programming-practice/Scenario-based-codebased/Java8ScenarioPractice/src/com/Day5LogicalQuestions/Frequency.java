package com.Day5LogicalQuestions;

import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {
public static void main(String[] args) {
	String input="banana";
	Map<Character,Long> map=
			input.chars()
			.mapToObj(c->(char)c)
			.collect(Collectors.groupingBy(c->c,Collectors.counting()));
	System.out.println(map);
}
}

