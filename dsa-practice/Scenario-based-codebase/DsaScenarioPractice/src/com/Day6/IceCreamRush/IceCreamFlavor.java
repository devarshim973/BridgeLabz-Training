package com.Day6.IceCreamRush;

public class IceCreamFlavor {

    private String name;
    private int salesCount;

    public IceCreamFlavor(String name, int salesCount) {
        this.name = name;
        this.salesCount = salesCount;
    }

    public String getName() {
        return name;
    }

    public int getSalesCount() {
        return salesCount;
    }

    @Override
    public String toString() {
        return name + " (Sold: " + salesCount + ")";
    }
}
