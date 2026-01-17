package com.Collections.SetInterface.SymmetricDifference;

import java.util.HashSet;
import java.util.Set;

public class SetSymmetricDifferenceCalculator {

    public static Set<Integer> findSymmetricDifference(
            Set<Integer> setOne,
            Set<Integer> setTwo) {

        // Union of both sets
        Set<Integer> result = new HashSet<>(setOne);
        result.addAll(setTwo);

        // Intersection of both sets
        Set<Integer> common = new HashSet<>(setOne);
        common.retainAll(setTwo);

        // Remove common elements from union
        result.removeAll(common);

        return result;
    }

    public static void main(String[] args) {

        Set<Integer> firstSet = new HashSet<>();
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);

        Set<Integer> secondSet = new HashSet<>();
        secondSet.add(3);
        secondSet.add(4);
        secondSet.add(5);

        Set<Integer> symmetricDifference =
                findSymmetricDifference(firstSet, secondSet);

        System.out.println("Set 1: " + firstSet);
        System.out.println("Set 2: " + secondSet);
        System.out.println("Symmetric Difference: " + symmetricDifference);
    }
}
