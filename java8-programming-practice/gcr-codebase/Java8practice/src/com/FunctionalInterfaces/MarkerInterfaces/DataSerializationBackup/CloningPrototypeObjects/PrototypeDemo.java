package com.FunctionalInterfaces.MarkerInterfaces.DataSerializationBackup.CloningPrototypeObjects;

public class PrototypeDemo {

    public static void main(String[] args) {

        try {
            Employee original = new Employee(101, "Rahul");
            Employee clone = (Employee) original.clone(); // clone object

            System.out.println("Original: " + original);
            System.out.println("Clone   : " + clone);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
