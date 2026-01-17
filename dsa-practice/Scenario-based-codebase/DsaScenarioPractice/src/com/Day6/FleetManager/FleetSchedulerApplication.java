package com.Day6.FleetManager;

import java.util.ArrayList;
import java.util.List;

public class FleetSchedulerApplication {

    public static void main(String[] args) {

        FleetManagerService fleetManager = new FleetManagerService();

        // Depot 1 - Already sorted by mileage
        List<FleetVehicle> depot1 = new ArrayList<>();
        depot1.add(new FleetVehicle("V101", "Depot1", 5000));
        depot1.add(new FleetVehicle("V102", "Depot1", 8000));
        depot1.add(new FleetVehicle("V103", "Depot1", 12000));

        // Depot 2 - Already sorted by mileage
        List<FleetVehicle> depot2 = new ArrayList<>();
        depot2.add(new FleetVehicle("V201", "Depot2", 3000));
        depot2.add(new FleetVehicle("V202", "Depot2", 7000));
        depot2.add(new FleetVehicle("V203", "Depot2", 15000));

        // Depot 3 - Already sorted by mileage
        List<FleetVehicle> depot3 = new ArrayList<>();
        depot3.add(new FleetVehicle("V301", "Depot3", 4000));
        depot3.add(new FleetVehicle("V302", "Depot3", 9000));

        List<List<FleetVehicle>> depotLists = new ArrayList<>();
        depotLists.add(depot1);
        depotLists.add(depot2);
        depotLists.add(depot3);

        // Merge depot lists
        List<FleetVehicle> masterSchedule = fleetManager.mergeDepotLists(depotLists);

        // Display final schedule
        fleetManager.displayMasterSchedule(masterSchedule);
    }
}
