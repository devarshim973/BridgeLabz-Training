package com.Day6.FleetManager;

import java.util.ArrayList;
import java.util.List;

public class FleetManagerService {

    // Merge multiple depot lists into a master schedule sorted by mileage
    public List<FleetVehicle> mergeDepotLists(List<List<FleetVehicle>> depotLists) {
        List<FleetVehicle> masterList = new ArrayList<>();
        for (List<FleetVehicle> depot : depotLists) {
            masterList = merge(masterList, depot);
        }
        return masterList;
    }

    // Merge two sorted lists by mileage
    private List<FleetVehicle> merge(List<FleetVehicle> list1, List<FleetVehicle> list2) {
        List<FleetVehicle> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getMileage() <= list2.get(j).getMileage()) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) merged.add(list1.get(i++));
        while (j < list2.size()) merged.add(list2.get(j++));

        return merged;
    }

    // Display master schedule
    public void displayMasterSchedule(List<FleetVehicle> masterList) {
        System.out.println("Fleet Maintenance Schedule (sorted by mileage):");
        for (FleetVehicle vehicle : masterList) {
            System.out.println(vehicle);
        }
    }
}
