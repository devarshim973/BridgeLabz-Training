package com.Day2.CallCenter;

import java.util.*;

class CallCenterQueueManager {

    private Queue<CallCenterCustomer> normalQueue;
    private PriorityQueue<CallCenterCustomer> vipQueue;
    private HashMap<String, Integer> callFrequencyMap;

    public CallCenterQueueManager() {

        normalQueue = new LinkedList<>();

        vipQueue = new PriorityQueue<>(
            (c1, c2) -> c1.isVip() ? -1 : 1
        );

        callFrequencyMap = new HashMap<>();
    }

    // Receive incoming call
    public void receiveCall(CallCenterCustomer customer) {

        callFrequencyMap.put(
            customer.getCustomerId(),
            callFrequencyMap.getOrDefault(customer.getCustomerId(), 0) + 1
        );

        if (customer.isVip()) {
            vipQueue.offer(customer);
            System.out.println("VIP call received: " + customer.getCustomerId());
        } else {
            normalQueue.offer(customer);
            System.out.println("Normal call received: " + customer.getCustomerId());
        }
    }

    // Handle next call
    public void handleNextCall() {

        CallCenterCustomer customer;

        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
        } else {
            System.out.println("No calls in queue");
            return;
        }

        System.out.println("Handling call from: " + customer.getCustomerId());
    }

    // Display call frequency
    public void displayCallFrequency() {

        System.out.println("Monthly Call Frequency:");
        for (String key : callFrequencyMap.keySet()) {
            System.out.println(key + " → " + callFrequencyMap.get(key));
        }
    }
}
