package com.linkedlist.singlylinkedlist.SocialMediaFriendConnections;

public class SocialNetworkLinkedList {
    private UserNode head;

    public SocialNetworkLinkedList() {
        head = null;
    }

    // Add new user
    public void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Find user by ID
    private UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add friend connection (bidirectional)
    public void addFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        addFriend(user1, userId2);
        addFriend(user2, userId1);
        System.out.println("Friend connection added");
    }

    private void addFriend(UserNode user, int friendId) {
        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = user.friendHead;
        user.friendHead = newFriend;
    }

    // Remove friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        removeFriend(user1, userId2);
        removeFriend(user2, userId1);
        System.out.println("Friend connection removed");
    }

    private void removeFriend(UserNode user, int friendId) {
        FriendNode temp = user.friendHead;

        if (temp == null)
            return;

        if (temp.friendId == friendId) {
            user.friendHead = temp.next;
            return;
        }

        while (temp.next != null && temp.next.friendId != friendId) {
            temp = temp.next;
        }

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Display all friends of a user
    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friendHead;

        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Count friends
    public void countFriends(int userId) {
        UserNode user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        int count = 0;
        FriendNode temp = user.friendHead;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println(user.name + " has " + count + " friends");
    }

    // Search user by ID
    public void searchById(int id) {
        UserNode user = findUserById(id);
        if (user != null) {
            displayUser(user);
        } else {
            System.out.println("User not found");
        }
    }

    // Search user by Name
    public void searchByName(String name) {
        UserNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("User not found");
    }

    private void displayUser(UserNode user) {
        System.out.println(
                "User ID: " + user.userId +
                ", Name: " + user.name +
                ", Age: " + user.age
        );
    }

    // Find mutual friends
    public void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Mutual Friends: ");
        FriendNode f1 = user1.friendHead;
        boolean found = false;

        while (f1 != null) {
            FriendNode f2 = user2.friendHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.print("None");

        System.out.println();
    }
}
