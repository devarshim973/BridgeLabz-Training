package com.Day6.ConversionLogicalQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListToMap {
	public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Python", "C++");

        // Stream-based easy method
        Map<Integer, String> map = IntStream.range(0, list.size())
                .boxed()
                .collect(Collectors.toMap(
                        i -> i,          // key = index
                        i -> list.get(i) // value = element
                ));

        System.out.println(map);
    }
}

