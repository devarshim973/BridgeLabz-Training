package com.Day2.CallCenter;

class CallCenterExecutionEngine {

    public static void main(String[] args) {

        CallCenterQueueManager manager =
                new CallCenterQueueManager();

        manager.receiveCall(new CallCenterCustomer("User102", false));
        manager.receiveCall(new CallCenterCustomer("VIP900", true));
        manager.receiveCall(new CallCenterCustomer("User101", false));
        manager.receiveCall(new CallCenterCustomer("VIP1000", true));

        manager.handleNextCall();
        manager.handleNextCall();
        manager.handleNextCall();

        manager.displayCallFrequency();
    }
}
