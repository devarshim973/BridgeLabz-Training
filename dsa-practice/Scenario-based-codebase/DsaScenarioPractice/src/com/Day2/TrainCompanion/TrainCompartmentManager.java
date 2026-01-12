package com.Day2.TrainCompanion;

class TrainCompartmentManager {

    private TrainCompartmentNode head;
    private TrainCompartmentNode tail;

    // Insert new compartment at end
    public void addCompartment(String name) {

        TrainCompartmentNode newNode =
                new TrainCompartmentNode(name);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
    }

    // Remove compartment by name
    public void removeCompartment(String name) {

        TrainCompartmentNode current = head;

        while (current != null) {

            if (current.compartmentName.equals(name)) {

                // Removing head
                if (current == head) {
                    head = head.next;
                    if (head != null) {
                        head.previous = null;
                    }
                }
                // Removing tail
                else if (current == tail) {
                    tail = tail.previous;
                    tail.next = null;
                }
                // Removing middle node
                else {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }

                System.out.println("Removed compartment: " + name);
                return;
            }
            current = current.next;
        }
    }

    // Traverse forward
    public void moveForward() {

        TrainCompartmentNode temp = head;
        System.out.print("Forward Walk: ");

        while (temp != null) {
            System.out.print(temp.compartmentName + " → ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Traverse backward
    public void moveBackward() {

        TrainCompartmentNode temp = tail;
        System.out.print("Backward Walk: ");

        while (temp != null) {
            System.out.print(temp.compartmentName + " → ");
            temp = temp.previous;
        }
        System.out.println("START");
    }

    // Show adjacent compartments
    public void showAdjacent(String name) {

        TrainCompartmentNode temp = head;

        while (temp != null) {

            if (temp.compartmentName.equals(name)) {

                String left =
                        (temp.previous != null)
                                ? temp.previous.compartmentName
                                : "None";

                String right =
                        (temp.next != null)
                                ? temp.next.compartmentName
                                : "None";

                System.out.println(
                        "Current: " + name +
                        " | Previous: " + left +
                        " | Next: " + right
                );
                return;
            }
            temp = temp.next;
        }
    }
}
