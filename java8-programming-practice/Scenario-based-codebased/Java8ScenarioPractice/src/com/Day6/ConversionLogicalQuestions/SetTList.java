package com.Day6.ConversionLogicalQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SetTList {
	public static void main(String[] args) {

        Set<String> set = Set.of("Java", "Spring", "API");

        List<String> list = new ArrayList<>(set);

        System.out.println(list);
}
}