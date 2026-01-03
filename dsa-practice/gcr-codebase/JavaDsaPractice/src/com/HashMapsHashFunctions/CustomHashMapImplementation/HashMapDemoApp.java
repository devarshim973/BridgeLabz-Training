package com.HashMapsHashFunctions.CustomHashMapImplementation;

public class HashMapDemoApp {

    public static void main(String[] args) {

        SimpleHashMap map = new SimpleHashMap(5);

        map.put(1, "Apple");
        map.put(6, "Banana");
        map.put(11, "Orange");
        map.put(2, "Grapes");

        System.out.println("Get key 6: " + map.get(6));

        map.remove(6);

        System.out.println("After removing key 6:");
        map.displayMap();
    }
}
