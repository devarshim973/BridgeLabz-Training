package com.Day11.BagnBallOrganizer;

public class PlayBall implements StorableItem {

    private String ballId;
    private String color;
    private String size; // small / medium / large

    public PlayBall(String ballId, String color, String size) {
        this.ballId = ballId;
        this.color = color;
        this.size = size;
    }

    @Override
    public String getId() {
        return ballId;
    }

    @Override
    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Ball [ID=" + ballId + ", Color=" + color + ", Size=" + size + "]";
    }
}
