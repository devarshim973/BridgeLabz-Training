package com.Day1.AmbulanceRouteEmergencyPatientNavigation;

class AmbulanceCircularRoute {

    private HospitalUnitNode head;

    // Add hospital unit to circular list
    public void addUnit(String unitName, boolean isAvailable) {

        HospitalUnitNode newNode =
                new HospitalUnitNode(unitName, isAvailable);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        HospitalUnitNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Find nearest available unit
    public void findAvailableUnit() {

        if (head == null) {
            System.out.println("No hospital units available");
            return;
        }

        HospitalUnitNode temp = head;

        do {
            if (temp.isAvailable) {
                System.out.println(
                    "Patient redirected to: " + temp.unitName);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("No units available currently");
    }

    // Remove unit under maintenance
    public void removeUnit(String unitName) {

        if (head == null) return;

        HospitalUnitNode current = head;
        HospitalUnitNode prev = null;

        do {
            if (current.unitName.equals(unitName)) {

                // Single node case
                if (current == head && current.next == head) {
                    head = null;
                    return;
                }

                // Removing head node
                if (current == head) {
                    HospitalUnitNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = current.next;
                }

                System.out.println("Unit removed: " + unitName);
                return;
            }

            prev = current;
            current = current.next;

        } while (current != head);
    }

    // Display circular route
    public void displayRoute() {

        if (head == null) {
            System.out.println("Route is empty");
            return;
        }

        HospitalUnitNode temp = head;
        System.out.print("Hospital Route: ");

        do {
            System.out.print(temp.unitName + " → ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(Back to " + head.unitName + ")");
    }
}
