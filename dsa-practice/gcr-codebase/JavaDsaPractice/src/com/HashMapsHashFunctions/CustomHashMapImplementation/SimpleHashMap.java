package com.HashMapsHashFunctions.CustomHashMapImplementation;

public class SimpleHashMap {

    private MapNodeUnit[] bucketArray;
    private int capacity;

    public SimpleHashMap(int capacity) {
        this.capacity = capacity;
        bucketArray = new MapNodeUnit[capacity];
    }

    // Hash Function
    private int getBucketIndex(int key) {
        return key % capacity;
    }

    // Insert or Update
    public void put(int key, String value) {

        int index = getBucketIndex(key);
        MapNodeUnit head = bucketArray[index];

        // Update if key exists
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert new node at beginning
        MapNodeUnit newNode = new MapNodeUnit(key, value);
        newNode.next = bucketArray[index];
        bucketArray[index] = newNode;
    }

    // Retrieve value
    public String get(int key) {

        int index = getBucketIndex(key);
        MapNodeUnit head = bucketArray[index];

        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }

        return null;
    }

    // Remove key
    public void remove(int key) {

        int index = getBucketIndex(key);
        MapNodeUnit head = bucketArray[index];
        MapNodeUnit previous = null;

        while (head != null) {
            if (head.key == key) {
                if (previous == null) {
                    bucketArray[index] = head.next;
                } else {
                    previous.next = head.next;
                }
                return;
            }
            previous = head;
            head = head.next;
        }
    }

    // Display Hash Map
    public void displayMap() {
        for (int i = 0; i < capacity; i++) {
            MapNodeUnit head = bucketArray[i];
            System.out.print("Bucket " + i + ": ");
            while (head != null) {
                System.out.print("[" + head.key + "=" + head.value + "] ");
                head = head.next;
            }
            System.out.println();
        }
    }
}
