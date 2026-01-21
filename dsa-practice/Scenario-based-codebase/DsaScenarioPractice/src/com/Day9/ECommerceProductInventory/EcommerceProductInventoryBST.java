package com.Day9.ECommerceProductInventory;

class EcommerceProductInventoryBST {

    // Product node class
    static class ProductNode {
        int sku;
        String productName;
        double price;
        ProductNode left;
        ProductNode right;

        ProductNode(int sku, String productName, double price) {
            this.sku = sku;
            this.productName = productName;
            this.price = price;
            this.left = null;
            this.right = null;
        }
    }

    private ProductNode root;

    // 1️⃣ Insert product
    void addProduct(int sku, String productName, double price) {
        root = insertProduct(root, sku, productName, price);
    }

    private ProductNode insertProduct(ProductNode current, int sku, String productName, double price) {
        if (current == null) {
            return new ProductNode(sku, productName, price);
        }

        if (sku < current.sku) {
            current.left = insertProduct(current.left, sku, productName, price);
        } else if (sku > current.sku) {
            current.right = insertProduct(current.right, sku, productName, price);
        }

        return current;
    }

    // 2️⃣ Lookup product by SKU
    ProductNode searchProduct(int sku) {
        return searchBySku(root, sku);
    }

    private ProductNode searchBySku(ProductNode current, int sku) {
        if (current == null || current.sku == sku) {
            return current;
        }

        return sku < current.sku
                ? searchBySku(current.left, sku)
                : searchBySku(current.right, sku);
    }

    // 3️⃣ Update price using SKU
    boolean updatePrice(int sku, double newPrice) {
        ProductNode product = searchProduct(sku);
        if (product != null) {
            product.price = newPrice;
            return true;
        }
        return false;
    }

    // 4️⃣ Display products in sorted SKU order
    void displaySortedProducts() {
        inorderTraversal(root);
    }

    private void inorderTraversal(ProductNode current) {
        if (current != null) {
            inorderTraversal(current.left);
            System.out.println(
                "SKU: " + current.sku +
                ", Name: " + current.productName +
                ", Price: ₹" + current.price
            );
            inorderTraversal(current.right);
        }
    }

    public static void main(String[] args) {

        EcommerceProductInventoryBST inventory = new EcommerceProductInventoryBST();

        inventory.addProduct(3005, "Laptop", 55000);
        inventory.addProduct(3001, "Mobile", 25000);
        inventory.addProduct(3008, "Headphones", 3000);
        inventory.addProduct(3003, "Keyboard", 1500);
        inventory.addProduct(3006, "Mouse", 800);

        System.out.println("📦 Product List (Sorted by SKU):");
        inventory.displaySortedProducts();

        System.out.println("\n🔍 Lookup SKU 3003:");
        ProductNode product = inventory.searchProduct(3003);
        if (product != null) {
            System.out.println("Found: " + product.productName + ", ₹" + product.price);
        }

        System.out.println("\n💰 Updating price for SKU 3003");
        inventory.updatePrice(3003, 1800);

        System.out.println("\n📦 Updated Product List:");
        inventory.displaySortedProducts();
    }
}
