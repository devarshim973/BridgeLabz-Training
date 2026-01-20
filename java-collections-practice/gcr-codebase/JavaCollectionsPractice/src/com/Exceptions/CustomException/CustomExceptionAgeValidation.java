package com.Exceptions.CustomException;

import java.util.Scanner;

//Custom Exception
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

//Main class
public class CustomExceptionAgeValidation {

 // Method to validate age
 public static void validateAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or above");
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your age: ");
     try {
         int age = sc.nextInt();
         validateAge(age); // Call method that may throw exception
         System.out.println("Access granted!");
     } catch (InvalidAgeException e) {
         System.out.println(e.getMessage());
     } catch (Exception e) {
         System.out.println("Invalid input! Please enter a valid number.");
     } finally {
         sc.close();
     }
 }
}
