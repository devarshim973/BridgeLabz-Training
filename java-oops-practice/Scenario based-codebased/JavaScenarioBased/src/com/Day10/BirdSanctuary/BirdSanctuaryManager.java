package com.Day10.BirdSanctuary;

import java.util.ArrayList;
import java.util.Iterator;

public class BirdSanctuaryManager {

    private ArrayList<BirdBase> birdList = new ArrayList<>();

    public void addBird(BirdBase bird) {
        birdList.add(bird);
        System.out.println("Bird added successfully.");
    }

    public void displayAllBirds() {
        for (BirdBase bird : birdList) {
            bird.displayInfo();
        }
    }

    public void displayFlyingBirds() {
        for (BirdBase bird : birdList) {
            if (bird instanceof Flyable) {
                bird.displayInfo();
                ((Flyable) bird).fly();
            }
        }
    }

    public void displaySwimmingBirds() {
        for (BirdBase bird : birdList) {
            if (bird instanceof Swimmable) {
                bird.displayInfo();
                ((Swimmable) bird).swim();
            }
        }
    }

    public void displayFlyingAndSwimmingBirds() {
        for (BirdBase bird : birdList) {
            if (bird instanceof Flyable && bird instanceof Swimmable) {
                bird.displayInfo();
            }
        }
    }

    public void removeBirdById(String id) {
        Iterator<BirdBase> iterator = birdList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getBirdId().equals(id)) {
                iterator.remove();
                System.out.println("Bird removed successfully.");
                return;
            }
        }
        System.out.println("Bird ID not found.");
    }

    public void sanctuaryReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (BirdBase bird : birdList) {
            boolean canFly = bird instanceof Flyable;
            boolean canSwim = bird instanceof Swimmable;

            if (canFly && canSwim) both++;
            else if (canFly) fly++;
            else if (canSwim) swim++;
            else neither++;
        }

        System.out.println("---- Sanctuary Report ----");
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }
}
