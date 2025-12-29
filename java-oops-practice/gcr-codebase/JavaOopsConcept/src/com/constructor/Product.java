package com.constructor;

public class Product {

    // Instance variables (unique for each object)
    String productName;
    double price;

    // Class variable (shared among all objects)
    static int totalProducts = 0;

    // Parameterized constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increase count when a product is created
    }

    // Instance method to display product details
    void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("-------------------------");
    }

    // Class method to display total products
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 20000);
        Product p3 = new Product("Headphones", 3000);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Calling class method
        Product.displayTotalProducts();
    }
}

