package com.Day6.ConversionLogicalQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class duplicate {
	public static void main(String[] args) {

        List<String> words = List.of("Java", "Spring", "API", "Stream"
        		);

        Map<Integer,List<String>> map =
        		 words.stream()
                 .collect(Collectors.groupingBy(String::length));
        System.out.println(map);
    }
}
