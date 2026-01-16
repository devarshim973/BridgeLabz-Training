package com.Day5.RoboWarehouse;

public class RoboWarehouseApp {

    public static void main(String[] args) {

        ShelfLoadingRobot robot = new ShelfLoadingRobot();

        robot.loadPackage(new WarehousePackage(101, 25.5));
        robot.loadPackage(new WarehousePackage(102, 10.2));
        robot.loadPackage(new WarehousePackage(103, 30.8));
        robot.loadPackage(new WarehousePackage(104, 18.0));

        System.out.println("Packages on Shelf (Ascending by Weight):");
        robot.displayShelf();
    }
}
