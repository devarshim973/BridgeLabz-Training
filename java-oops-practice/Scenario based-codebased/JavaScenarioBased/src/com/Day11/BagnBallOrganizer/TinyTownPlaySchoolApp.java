package com.Day11.BagnBallOrganizer;

public class TinyTownPlaySchoolApp {

    public static void main(String[] args) {

        ToyBag redBag = new ToyBag("BAG101", "Red", 2);
        ToyBag blueBag = new ToyBag("BAG102", "Blue", 3);

        PlayBall ball1 = new PlayBall("BALL1", "Yellow", "Small");
        PlayBall ball2 = new PlayBall("BALL2", "Green", "Medium");
        PlayBall ball3 = new PlayBall("BALL3", "Blue", "Large");

        redBag.addBall(ball1);
        redBag.addBall(ball2);
        redBag.addBall(ball3); // should fail (capacity)

        redBag.displayBalls();
        redBag.removeBall("BALL1");
        redBag.displayBalls();

        BagBallOrganizer organizer = new BagBallOrganizer();
        organizer.addBag(redBag);
        organizer.addBag(blueBag);

        organizer.displayAllBags();
    }
}
