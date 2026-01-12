package com.Day2.TrafficManager;

class TrafficManagerExecutionEngine {

    public static void main(String[] args) {

        TrafficRoundaboutManager roundabout =
                new TrafficRoundaboutManager();

        VehicleWaitingQueue waitingQueue =
                new VehicleWaitingQueue(3);

        waitingQueue.enqueueVehicle("CAR-101");
        waitingQueue.enqueueVehicle("CAR-102");
        waitingQueue.enqueueVehicle("CAR-103");
        waitingQueue.enqueueVehicle("CAR-104"); // Overflow

        while (waitingQueue.hasWaitingVehicles()) {
            String vehicle = waitingQueue.dequeueVehicle();
            roundabout.addVehicle(vehicle);
        }

        roundabout.displayRoundabout();

        roundabout.removeVehicle("CAR-102");
        roundabout.displayRoundabout();
    }
}
