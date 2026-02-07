package com.Day6.ConversionLogicalQuestions;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ListToSet {
	 public static void main(String[] args) {

	        List<String> list = List.of("Java", "Spring", "Java", "API");
Set<String> set= list.stream()
.collect(Collectors.toCollection(TreeSet::new));
System.out.println(set);
}
}