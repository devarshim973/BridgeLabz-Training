package com.linkedlist.singlylinkedlist.InventoryManagementSystem;

public class InventoryLinkedList {
    private InventoryNode head;

    public InventoryLinkedList() {
        head = null;
    }

    // Add at beginning
    public void addAtBeginning(int id, String name, int qty, double price) {
        InventoryNode newNode = new InventoryNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int id, String name, int qty, double price) {
        InventoryNode newNode = new InventoryNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        InventoryNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int position, int id, String name, int qty, double price) {
        if (position <= 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        InventoryNode newNode = new InventoryNode(id, name, qty, price);
        InventoryNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove item by ID
    public void removeByItemId(int id) {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed successfully");
            return;
        }

        InventoryNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed successfully");
        }
    }

    // Update quantity by ID
    public void updateQuantity(int id, int newQuantity) {
        InventoryNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQuantity;
                System.out.println("Quantity updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Item ID
    public void searchById(int id) {
        InventoryNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Item Name
    public void searchByName(String name) {
        InventoryNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found");
        }
    }

    // Calculate total inventory value
    public void calculateTotalValue() {
        InventoryNode temp = head;
        double totalValue = 0;

        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: ₹" + totalValue);
    }

    // Display all items
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        InventoryNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    private void displayItem(InventoryNode node) {
        System.out.println(
                "ID: " + node.itemId +
                ", Name: " + node.itemName +
                ", Qty: " + node.quantity +
                ", Price: ₹" + node.price
        );
    }

    // -------- SORTING SECTION --------

    public void sortByName(boolean ascending) {
        head = mergeSort(head, true, ascending);
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, false, ascending);
    }

    private InventoryNode mergeSort(InventoryNode node, boolean sortByName, boolean asc) {
        if (node == null || node.next == null)
            return node;

        InventoryNode middle = getMiddle(node);
        InventoryNode nextOfMiddle = middle.next;
        middle.next = null;

        InventoryNode left = mergeSort(node, sortByName, asc);
        InventoryNode right = mergeSort(nextOfMiddle, sortByName, asc);

        return merge(left, right, sortByName, asc);
    }

    private InventoryNode merge(InventoryNode a, InventoryNode b,
                                boolean sortByName, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (sortByName) {
            condition = asc
                    ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                    : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = asc
                    ? a.price <= b.price
                    : a.price > b.price;
        }

        InventoryNode result;
        if (condition) {
            result = a;
            result.next = merge(a.next, b, sortByName, asc);
        } else {
            result = b;
            result.next = merge(a, b.next, sortByName, asc);
        }
        return result;
    }

    private InventoryNode getMiddle(InventoryNode node) {
        if (node == null) return node;

        InventoryNode slow = node;
        InventoryNode fast = node.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
