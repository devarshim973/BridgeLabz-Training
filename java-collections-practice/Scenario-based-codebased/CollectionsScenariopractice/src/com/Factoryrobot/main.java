package com.Factoryrobot;



import java.util.Scanner;

//Custom Exception
class RobotSafetyException extends Exception {
 public RobotSafetyException(String message) {
     super(message);
 }
}

//Main Logic Class
class RobotHazardAuditor {

 public double CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState)
         throws RobotSafetyException {

     // Validate armPrecision
     if (armPrecision < 0.0 || armPrecision > 1.0) {
         throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
     }

     // Validate workerDensity
     if (workerDensity < 1 || workerDensity > 20) {
         throw new RobotSafetyException("Error: Worker density must be 1-20");
     }

     // Validate machineryState (case-sensitive)
     double riskFactor;

     if (machineryState.equals("Worn")) {
         riskFactor = 1.3;
     } else if (machineryState.equals("Faulty")) {
         riskFactor = 2.0;
     } else if (machineryState.equals("Critical")) {
         riskFactor = 3.0;
     } else {
         throw new RobotSafetyException("Error: Unsupported machinery state");
     }

     // Hazard Risk Formula
     double risk = ((1.0 - armPrecision) * 15.0) + (workerDensity * riskFactor);

     return risk;
 }
}

//Program Class
public class main {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     RobotHazardAuditor auditor = new RobotHazardAuditor();

     try {
         System.out.println("Enter Arm Precision (0.0 - 1.0):");
         double armPrecision = sc.nextDouble();

         System.out.println("Enter Worker Density (1 - 20):");
         int workerDensity = sc.nextInt();
         sc.nextLine(); // consume leftover newline

         System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
         String machineryState = sc.nextLine();

         double result = auditor.CalculateHazardRisk(
                 armPrecision, workerDensity, machineryState);

         System.out.println();
         System.out.println("Robot Hazard Risk Score: " + result);

     } catch (RobotSafetyException e) {
         System.out.println(e.getMessage());
     }

     sc.close();
 }
}
