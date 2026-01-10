package com.Day1.AmbulanceRouteEmergencyPatientNavigation;

class AmbulanceRouteExecutionEngine {

    public static void main(String[] args) {

        AmbulanceCircularRoute route =
                new AmbulanceCircularRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.displayRoute();

        route.findAvailableUnit();

        route.removeUnit("Radiology");
        route.displayRoute();

        route.findAvailableUnit();
    }
}
