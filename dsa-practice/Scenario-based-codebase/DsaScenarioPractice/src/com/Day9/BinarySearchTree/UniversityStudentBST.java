package com.Day9.BinarySearchTree;

class UniversityStudentBST {

    // Node class for BST
    static class StudentNode {
        int rollNumber;
        String studentName;
        StudentNode left;
        StudentNode right;

        StudentNode(int rollNumber, String studentName) {
            this.rollNumber = rollNumber;
            this.studentName = studentName;
            this.left = null;
            this.right = null;
        }
    }

    // Root of BST
    private StudentNode root;

    // 1️⃣ Insert student record
    void insertStudent(int rollNumber, String studentName) {
        root = insertRecord(root, rollNumber, studentName);
    }

    private StudentNode insertRecord(StudentNode current, int rollNumber, String studentName) {
        if (current == null) {
            return new StudentNode(rollNumber, studentName);
        }

        if (rollNumber < current.rollNumber) {
            current.left = insertRecord(current.left, rollNumber, studentName);
        } else if (rollNumber > current.rollNumber) {
            current.right = insertRecord(current.right, rollNumber, studentName);
        }

        return current;
    }

    // 2️⃣ Search student by roll number
    boolean searchStudent(int rollNumber) {
        return searchRecord(root, rollNumber);
    }

    private boolean searchRecord(StudentNode current, int rollNumber) {
        if (current == null) {
            return false;
        }

        if (rollNumber == current.rollNumber) {
            return true;
        }

        return rollNumber < current.rollNumber
                ? searchRecord(current.left, rollNumber)
                : searchRecord(current.right, rollNumber);
    }

    // 3️⃣ Delete student record
    void deleteStudent(int rollNumber) {
        root = deleteRecord(root, rollNumber);
    }

    private StudentNode deleteRecord(StudentNode current, int rollNumber) {

        if (current == null) {
            return null;
        }

        if (rollNumber < current.rollNumber) {
            current.left = deleteRecord(current.left, rollNumber);
        } else if (rollNumber > current.rollNumber) {
            current.right = deleteRecord(current.right, rollNumber);
        } else {

            // Case 1: No child
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: One child
            if (current.left == null) {
                return current.right;
            }

            if (current.right == null) {
                return current.left;
            }

            // Case 3: Two children
            StudentNode smallest = findMin(current.right);
            current.rollNumber = smallest.rollNumber;
            current.studentName = smallest.studentName;
            current.right = deleteRecord(current.right, smallest.rollNumber);
        }
        return current;
    }

    private StudentNode findMin(StudentNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    // 4️⃣ Display students in sorted order (Inorder Traversal)
    void displaySortedStudents() {
        inorderTraversal(root);
    }

    private void inorderTraversal(StudentNode current) {
        if (current != null) {
            inorderTraversal(current.left);
            System.out.println("Roll No: " + current.rollNumber + ", Name: " + current.studentName);
            inorderTraversal(current.right);
        }
    }

    public static void main(String[] args) {

        UniversityStudentBST bst = new UniversityStudentBST();

        // Scenario 1: Insertion
        bst.insertStudent(105, "Ravi");
        bst.insertStudent(102, "Amit");
        bst.insertStudent(108, "Neha");
        bst.insertStudent(101, "Suman");
        bst.insertStudent(104, "Pooja");

        // Scenario 3: Display sorted roll numbers
        System.out.println("📋 Student Records (Sorted by Roll Number):");
        bst.displaySortedStudents();

        // Scenario 3: Search
        System.out.println("\n🔍 Search Roll No 104: " + bst.searchStudent(104));
        System.out.println("🔍 Search Roll No 110: " + bst.searchStudent(110));

        // Scenario 2: Deletion
        System.out.println("\n❌ Deleting Roll No 102");
        bst.deleteStudent(102);

        System.out.println("\n📋 Updated Student Records:");
        bst.displaySortedStudents();
    }
}
