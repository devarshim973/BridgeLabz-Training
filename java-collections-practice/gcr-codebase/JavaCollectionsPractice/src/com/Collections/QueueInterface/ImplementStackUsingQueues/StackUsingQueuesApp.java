package com.Collections.QueueInterface.ImplementStackUsingQueues;

public class StackUsingQueuesApp {

    public static void main(String[] args) {

        StackUsingTwoQueues stack = new StackUsingTwoQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top after pop: " + stack.top());
    }
}
