package com.Day2.TrafficManager;

import java.util.LinkedList;
import java.util.Queue;

class VehicleWaitingQueue {

    private Queue<String> waitingQueue;
    private int capacity;

    public VehicleWaitingQueue(int capacity) {
        this.capacity = capacity;
        waitingQueue = new LinkedList<>();
    }

    // Add vehicle to waiting queue
    public void enqueueVehicle(String vehicleNumber) {

        if (waitingQueue.size() == capacity) {
            System.out.println("Queue Overflow: " + vehicleNumber + " cannot enter");
            return;
        }

        waitingQueue.offer(vehicleNumber);
        System.out.println("Vehicle waiting: " + vehicleNumber);
    }

    // Remove vehicle from waiting queue
    public String dequeueVehicle() {

        if (waitingQueue.isEmpty()) {
            System.out.println("Queue Underflow: No vehicles waiting");
            return null;
        }

        return waitingQueue.poll();
    }

    public boolean hasWaitingVehicles() {
        return !waitingQueue.isEmpty();
    }
}
