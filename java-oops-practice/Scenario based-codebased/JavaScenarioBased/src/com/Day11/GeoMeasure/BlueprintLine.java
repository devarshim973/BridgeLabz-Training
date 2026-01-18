package com.Day11.GeoMeasure;

public class BlueprintLine {

    // Private data (Encapsulation)
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    // Constructor to initialize line
    public BlueprintLine(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Public method to calculate length
    public double calculateLength() {
        return Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );
    }

    @Override
    public String toString() {
        return "Line [(" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")]";
    }
}
