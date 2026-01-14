package com.Day10.BirdSanctuary;

import java.util.Scanner;

public class EcoWingSanctuaryApplication {

    public static void main(String[] args) {

        BirdSanctuaryManager manager = new BirdSanctuaryManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to EcoWing Bird Sanctuary");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display Flying Birds");
            System.out.println("4. Display Swimming Birds");
            System.out.println("5. Display Both Flying & Swimming Birds");
            System.out.println("6. Delete Bird by ID");
            System.out.println("7. Sanctuary Report");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Type (Eagle/Duck/Penguin/Kiwi): ");
                    String type = scanner.nextLine();

                    if (type.equalsIgnoreCase("Eagle"))
                        manager.addBird(new EagleBird(id, name));
                    else if (type.equalsIgnoreCase("Duck"))
                        manager.addBird(new DuckBird(id, name));
                    else if (type.equalsIgnoreCase("Penguin"))
                        manager.addBird(new PenguinBird(id, name));
                    else if (type.equalsIgnoreCase("Kiwi"))
                        manager.addBird(new KiwiBird(id, name));
                    else
                        System.out.println("Invalid bird type.");
                    break;

                case 2:
                    manager.displayAllBirds();
                    break;
                case 3:
                    manager.displayFlyingBirds();
                    break;
                case 4:
                    manager.displaySwimmingBirds();
                    break;
                case 5:
                    manager.displayFlyingAndSwimmingBirds();
                    break;
                case 6:
                    System.out.print("Enter Bird ID to delete: ");
                    manager.removeBirdById(scanner.nextLine());
                    break;
                case 7:
                    manager.sanctuaryReport();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
