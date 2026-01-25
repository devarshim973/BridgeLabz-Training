package com.Collections.SetInterface.CheckTwoSetsAreEqual;

import java.util.HashSet;
import java.util.Set;

public class SetEqualityValidator {

    public static boolean areSetsEqual(
            Set<Integer> setOne,
            Set<Integer> setTwo) {

        // If sizes differ, sets cannot be equal
        if (setOne.size() != setTwo.size()) {
            return false;
        }

        // containsAll checks element equality ignoring order
        return setOne.containsAll(setTwo);
    }

    public static void main(String[] args) {

        Set<Integer> firstSet = new HashSet<>();
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);

        Set<Integer> secondSet = new HashSet<>();
        secondSet.add(3);
        secondSet.add(2);
        secondSet.add(1);

        boolean result =
                areSetsEqual(firstSet, secondSet);

        System.out.println("Are sets equal? " + result);
    }
}
