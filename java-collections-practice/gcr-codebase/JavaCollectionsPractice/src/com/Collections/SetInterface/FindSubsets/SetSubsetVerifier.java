package com.Collections.SetInterface.FindSubsets;

import java.util.HashSet;
import java.util.Set;

public class SetSubsetVerifier {

    public static boolean isSubset(
            Set<Integer> subset,
            Set<Integer> mainSet) {

        // containsAll checks subset relationship
        return mainSet.containsAll(subset);
    }

    public static void main(String[] args) {

        Set<Integer> setOne = new HashSet<>();
        setOne.add(2);
        setOne.add(3);

        Set<Integer> setTwo = new HashSet<>();
        setTwo.add(1);
        setTwo.add(2);
        setTwo.add(3);
        setTwo.add(4);

        boolean result =
                isSubset(setOne, setTwo);

        System.out.println(
                "Is Set1 a subset of Set2? " + result
        );
    }
}
