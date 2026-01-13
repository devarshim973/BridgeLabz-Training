package com.Day3.ParcelTracker;

public class DeliveryStageNode {

    String stageName;
    DeliveryStageNode nextStage;

    public DeliveryStageNode(String stageName) {
        this.stageName = stageName;
        this.nextStage = null;
    }
}
