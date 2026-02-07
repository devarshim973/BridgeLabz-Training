package com.Day6.ConversionLogicalQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMap {
	public static void main(String[] args) {
		Map<String,Integer> word= Map.of(
				"ayush",101,
				"nikhil",102,
				"aaman",103);
		word.entrySet().stream()
				.forEach(e-> System.out.println(e.getKey()+ "="+ e.getValue()));
}
}