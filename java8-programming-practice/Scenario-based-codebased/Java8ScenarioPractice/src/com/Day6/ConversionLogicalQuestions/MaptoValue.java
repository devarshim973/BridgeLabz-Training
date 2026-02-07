package com.Day6.ConversionLogicalQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MaptoValue {
	public static void main(String[] args) {

        Map<Integer, String> map = Map.of(
            1, "Java",
            2, "Spring",
            3, "API"
        );
        List<String> values= new ArrayList<>(map.values());
        System.out.println(values);
        
}
}