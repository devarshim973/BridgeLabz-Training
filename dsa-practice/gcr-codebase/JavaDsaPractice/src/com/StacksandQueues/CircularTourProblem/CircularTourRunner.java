package com.StacksandQueues.CircularTourProblem;

public class CircularTourRunner {

    public static void main(String[] args) {

        int[] petrol = {6, 3, 7};
        int[] distance = {4, 6, 3};

        CircularTourService service = new CircularTourService();
        int startPoint = service.findStartingPump(petrol, distance);

        if (startPoint != -1) {
            System.out.println("Start the tour at petrol pump index: " + startPoint);
        } else {
            System.out.println("No possible circular tour.");
        }
    }
}
