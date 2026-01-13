package com.Day3.ParcelTracker;

public class ParcelDeliveryChain {

    private DeliveryStageNode headStage;

    // Add default stage at end
    public void addStage(String stageName) {

        DeliveryStageNode newStage = new DeliveryStageNode(stageName);

        if (headStage == null) {
            headStage = newStage;
            return;
        }

        DeliveryStageNode temp = headStage;
        while (temp.nextStage != null) {
            temp = temp.nextStage;
        }
        temp.nextStage = newStage;
    }

    // Add custom checkpoint after a given stage
    public void addCheckpointAfter(String existingStage, String newStageName) {

        DeliveryStageNode temp = headStage;

        while (temp != null && !temp.stageName.equals(existingStage)) {
            temp = temp.nextStage;
        }

        if (temp == null) {
            System.out.println("Stage not found: " + existingStage);
            return;
        }

        DeliveryStageNode checkpoint = new DeliveryStageNode(newStageName);
        checkpoint.nextStage = temp.nextStage;
        temp.nextStage = checkpoint;
    }

    // Forward tracking through stages
    public void trackParcel() {

        if (headStage == null) {
            System.out.println("Parcel is missing. No tracking available.");
            return;
        }

        DeliveryStageNode temp = headStage;

        System.out.println("Parcel Tracking Status:");

        while (temp != null) {
            System.out.print(temp.stageName + " → ");
            temp = temp.nextStage;
        }

        System.out.println("END");
    }
}
