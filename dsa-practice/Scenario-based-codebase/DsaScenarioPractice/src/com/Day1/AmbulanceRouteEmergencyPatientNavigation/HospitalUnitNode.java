package com.Day1.AmbulanceRouteEmergencyPatientNavigation;

class HospitalUnitNode {

    String unitName;
    boolean isAvailable;
    HospitalUnitNode next;

    public HospitalUnitNode(String unitName, boolean isAvailable) {
        this.unitName = unitName;
        this.isAvailable = isAvailable;
        this.next = null;
    }
}
