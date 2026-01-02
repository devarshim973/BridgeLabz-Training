package com.linkedlist.singlylinkedlist.SocialMediaFriendConnections;

public class SocialMediaApplication {
    public static void main(String[] args) {

        SocialNetworkLinkedList network = new SocialNetworkLinkedList();

        network.addUser(1, "Amit", 22);
        network.addUser(2, "Neha", 21);
        network.addUser(3, "Rahul", 23);
        network.addUser(4, "Sneha", 20);

        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.addFriendConnection(2, 3);
        network.addFriendConnection(2, 4);

        network.displayFriends(2);

        network.countFriends(1);

        network.findMutualFriends(1, 2);

        network.removeFriendConnection(1, 3);

        network.displayFriends(1);

        network.searchByName("Sneha");
        network.searchById(3);
    }
}
