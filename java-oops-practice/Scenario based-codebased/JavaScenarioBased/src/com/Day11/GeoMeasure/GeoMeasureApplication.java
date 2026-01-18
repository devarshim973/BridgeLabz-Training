package com.Day11.GeoMeasure;

import java.util.ArrayList;
import java.util.List;

public class GeoMeasureApplication {

    public static void main(String[] args) {

        List<BlueprintLine[]> lineComparisons = new ArrayList<>();

        // Comparison 1
        lineComparisons.add(new BlueprintLine[]{
                new BlueprintLine(0, 0, 3, 4),
                new BlueprintLine(1, 1, 4, 5)
        });

        // Comparison 2
        lineComparisons.add(new BlueprintLine[]{
                new BlueprintLine(2, 2, 6, 2),
                new BlueprintLine(0, 0, 2, 2)
        });

        // Perform comparisons
        for (BlueprintLine[] pair : lineComparisons) {
            LineComparatorService.compareLines(pair[0], pair[1]);
        }
    }
}
