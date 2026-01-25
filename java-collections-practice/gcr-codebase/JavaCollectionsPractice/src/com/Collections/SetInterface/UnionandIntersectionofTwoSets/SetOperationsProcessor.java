package com.Collections.SetInterface.UnionandIntersectionofTwoSets;

import java.util.HashSet;
import java.util.Set;

public class SetOperationsProcessor {

    public static Set<Integer> findUnion(
            Set<Integer> setOne,
            Set<Integer> setTwo) {

        Set<Integer> unionSet = new HashSet<>(setOne);
        unionSet.addAll(setTwo);
        return unionSet;
    }

    public static Set<Integer> findIntersection(
            Set<Integer> setOne,
            Set<Integer> setTwo) {

        Set<Integer> intersectionSet = new HashSet<>(setOne);
        intersectionSet.retainAll(setTwo);
        return intersectionSet;
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

        Set<Integer> unionResult =
                findUnion(firstSet, secondSet);

        Set<Integer> intersectionResult =
                findIntersection(firstSet, secondSet);

        System.out.println("Set 1: " + firstSet);
        System.out.println("Set 2: " + secondSet);
        System.out.println("Union: " + unionResult);
        System.out.println("Intersection: " + intersectionResult);
    }
}
