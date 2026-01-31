package com.StreamAPI.StreamAPI.TransformingNamesDisplay;

import java.util.*;

public class TransformCustomerNames {

    public static void main(String[] args) {

        List<String> customerNames = Arrays.asList(
            "rahul",
            "Amit",
            "neha",
            "Pooja",
            "vikas"
        );

        customerNames.stream()

            // convert to uppercase
            .map(String::toUpperCase)

            // sort alphabetically
            .sorted()

            // print result
            .forEach(System.out::println);
    }
}
