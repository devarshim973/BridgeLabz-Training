package com.Day6.ConversionLogicalQuestions;
import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class frequency {
	public static void main(String[] args) {
		List <String> word= List.of( "apple", "banana", "apple", "orange", "banana", "apple");
		Map<String,Long> map=word.stream()
				.collect(Collectors.groupingBy(
                       s->s,   // key
                        Collectors.counting()     // initial value
                      ));   
		System.out.println(map);
}
}