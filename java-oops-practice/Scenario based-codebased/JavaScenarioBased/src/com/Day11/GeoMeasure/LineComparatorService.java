package com.Day11.GeoMeasure;

public class LineComparatorService {

    public static void compareLines(BlueprintLine line1, BlueprintLine line2) {

        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        System.out.println(line1 + " → Length: " + length1);
        System.out.println(line2 + " → Length: " + length2);

        if (Double.compare(length1, length2) == 0) {
            System.out.println("✅ Both lines are EQUAL in length.");
        } else if (length1 > length2) {
            System.out.println("➡️ First line is LONGER.");
        } else {
            System.out.println("➡️ Second line is LONGER.");
        }

        System.out.println("--------------------------------");
    }
}
