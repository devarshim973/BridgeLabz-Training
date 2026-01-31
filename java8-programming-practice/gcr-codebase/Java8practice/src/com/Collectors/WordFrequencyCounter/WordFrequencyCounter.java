package com.Collectors.WordFrequencyCounter;

import java.util.*;
import java.util.stream.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String paragraph = "java is powerful and java is popular and java is everywhere";

        Map<String, Integer> wordCount =
                Arrays.stream(paragraph.toLowerCase().split("\\s+"))

                      .collect(Collectors.toMap(
                          word -> word,      // key: word
                          word -> 1,         // value: initial count
                          Integer::sum       // merge function for duplicates
                      ));

        wordCount.forEach((word, count) ->
            System.out.println(word + " → " + count)
        );
    }
}
