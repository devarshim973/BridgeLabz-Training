package com.AssesmentProblemOceanfeet;

import java.util.Scanner;
import java.util.List;

public class VesselMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VesselUtil vesselUtil = new VesselUtil();

        System.out.println("Enter the number of vessels to be added");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter vessel details");
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] data = input.split(":");

            Vessel vessel = new Vessel(
                    data[0],
                    data[1],
                    Double.parseDouble(data[2]),
                    data[3]
            );

            vesselUtil.addVesselPerformane(vessel);
        }

        System.out.println("Enter the Vessel Id to check speed");
        String searchId = scanner.nextLine();

        Vessel found = vesselUtil.getVesselById(searchId);

        if (found != null) {
            System.out.println(found.getVesselId() + " | "
                    + found.getVesselName() + " | "
                    + found.getVesselType() + " | "
                    + found.getAverageSpeed() + " knots");
        } else {
            System.out.println("Vessel Id " + searchId + " not found");
        }

        System.out.println("High performance vessels are");
        List<Vessel> list = vesselUtil.getHighPerformanceVessels();

        for (Vessel v : list) {
            System.out.println(v.getVesselId() + " | "
                    + v.getVesselName() + " | "
                    + v.getVesselType() + " | "
                    + v.getAverageSpeed() + " knots");
        }

        scanner.close();
    }
}
