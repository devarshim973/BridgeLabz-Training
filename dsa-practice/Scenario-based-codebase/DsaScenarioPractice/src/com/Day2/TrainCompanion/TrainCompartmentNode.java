package com.Day2.TrainCompanion;

class TrainCompartmentNode {

    String compartmentName;
    TrainCompartmentNode previous;
    TrainCompartmentNode next;

    public TrainCompartmentNode(String compartmentName) {
        this.compartmentName = compartmentName;
        this.previous = null;
        this.next = null;
    }
}
