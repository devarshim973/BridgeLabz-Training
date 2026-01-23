package com.Day10.GamingApp;

class AVLLeaderboard {

    private PlayerNode root;

    // Get height
    private int height(PlayerNode node) {
        return node == null ? 0 : node.height;
    }

    // Balance factor
    private int getBalance(PlayerNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Right rotation (LL case)
    private PlayerNode rightRotate(PlayerNode y) {
        PlayerNode x = y.left;
        PlayerNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotation (RR case)
    private PlayerNode leftRotate(PlayerNode x) {
        PlayerNode y = x.right;
        PlayerNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert / Update player
    private PlayerNode insert(PlayerNode node, String name, int score) {

        if (node == null)
            return new PlayerNode(name, score);

        if (score < node.score)
            node.left = insert(node.left, name, score);
        else if (score > node.score)
            node.right = insert(node.right, name, score);
        else
            return node; // duplicate score ignored

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // Balancing cases
        if (balance > 1 && score < node.left.score)
            return rightRotate(node);

        if (balance < -1 && score > node.right.score)
            return leftRotate(node);

        if (balance > 1 && score > node.left.score) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && score < node.right.score) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Public method
    public void addOrUpdatePlayer(String name, int score) {
        root = insert(root, name, score);
    }

    // Show Top 10 players
    private void reverseInOrder(PlayerNode node, int[] count) {
        if (node == null || count[0] >= 10)
            return;

        reverseInOrder(node.right, count);

        if (count[0] < 10) {
            System.out.println(node.playerName + " → " + node.score);
            count[0]++;
        }

        reverseInOrder(node.left, count);
    }

    public void displayTopPlayers() {
        System.out.println("🏆 Top Players Leaderboard:");
        int[] count = {0};
        reverseInOrder(root, count);
    }
}
