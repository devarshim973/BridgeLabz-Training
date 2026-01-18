package com.Day11.BagnBallOrganizer;

import java.util.ArrayList;
import java.util.List;

public class ToyBag implements StorableItem {

    private String bagId;
    private String color;
    private int capacity;
    private List<PlayBall> balls;

    public ToyBag(String bagId, String color, int capacity) {
        this.bagId = bagId;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    @Override
    public String getId() {
        return bagId;
    }

    @Override
    public String getColor() {
        return color;
    }

    // Add ball (capacity check)
    public void addBall(PlayBall ball) {
        if (balls.size() >= capacity) {
            System.out.println("❌ Bag " + bagId + " is FULL. Cannot add ball.");
            return;
        }
        balls.add(ball);
        System.out.println("✅ Ball added to Bag " + bagId);
    }

    // Remove ball by ID
    public void removeBall(String ballId) {
        for (PlayBall ball : balls) {
            if (ball.getId().equals(ballId)) {
                balls.remove(ball);
                System.out.println("🗑️ Ball removed from Bag " + bagId);
                return;
            }
        }
        System.out.println("⚠️ Ball not found in Bag " + bagId);
    }

    // Display balls
    public void displayBalls() {
        System.out.println("📦 Bag " + bagId + " contains:");
        if (balls.isEmpty()) {
            System.out.println("  (No balls)");
        }
        for (PlayBall ball : balls) {
            System.out.println("  " + ball);
        }
    }

    public int getBallCount() {
        return balls.size();
    }

    public int getCapacity() {
        return capacity;
    }
}
