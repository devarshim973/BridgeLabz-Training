package com.Day2.TrainCompanion;

class TrainCompanionExecutionEngine {

    public static void main(String[] args) {

        TrainCompartmentManager manager =
                new TrainCompartmentManager();

        manager.addCompartment("Engine");
        manager.addCompartment("Sleeper");
        manager.addCompartment("AC");
        manager.addCompartment("Pantry");
        manager.addCompartment("WiFi");
        manager.addCompartment("Guard");

        manager.moveForward();
        manager.moveBackward();

        manager.showAdjacent("Pantry");

        manager.removeCompartment("WiFi");
        manager.moveForward();
    }
}
