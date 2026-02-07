package com.Day6.ConversionLogicalQuestions;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class setreverse {
	public static void main(String[] args) {

        Set<Integer> set = Set.of(1, 2, 3, 4, 5);
        List<Integer> list=set.stream()
        		.sorted(Collections.reverseOrder())
        		.collect(Collectors.toList());
        System.out.println(list);
	}
}
