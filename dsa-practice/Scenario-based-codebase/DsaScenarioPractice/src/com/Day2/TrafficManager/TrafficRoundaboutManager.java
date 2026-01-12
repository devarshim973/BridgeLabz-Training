package com.Day2.TrafficManager;

class TrafficRoundaboutManager {

    private RoundaboutVehicleNode head;

    // Add vehicle into roundabout
    public void addVehicle(String vehicleNumber) {

        RoundaboutVehicleNode newNode =
                new RoundaboutVehicleNode(vehicleNumber);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        RoundaboutVehicleNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Remove vehicle from roundabout
    public void removeVehicle(String vehicleNumber) {

        if (head == null) return;

        RoundaboutVehicleNode current = head;
        RoundaboutVehicleNode prev = null;

        do {
            if (current.vehicleNumber.equals(vehicleNumber)) {

                // Single vehicle case
                if (current == head && current.next == head) {
                    head = null;
                    return;
                }

                // Removing head
                if (current == head) {
                    RoundaboutVehicleNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = current.next;
                }

                System.out.println("Vehicle exited: " + vehicleNumber);
                return;
            }

            prev = current;
            current = current.next;

        } while (current != head);
    }

    // Display roundabout state
    public void displayRoundabout() {

        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        RoundaboutVehicleNode temp = head;
        System.out.print("Roundabout: ");

        do {
            System.out.print(temp.vehicleNumber + " → ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(cycle)");
    }
}
