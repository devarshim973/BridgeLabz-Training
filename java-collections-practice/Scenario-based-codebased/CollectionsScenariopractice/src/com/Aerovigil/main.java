package com.Aerovigil;

import java.util.Scanner;

class InvalidFlightException extends Exception{
	public InvalidFlightException(String message) {
		super(message);
	}
	
}

class FlightUtil{
	

	public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
		if(flightNumber==null ||!flightNumber.matches("FL-\\d{4}") ) {
			throw new InvalidFlightException("The flight number " + flightNumber + " is invalid");
		
		}
		int num=Integer.parseInt(flightNumber.substring(3));
		if(num<1000||num>9999) {
			throw new InvalidFlightException("The flight number " + flightNumber + " is invalid");
		}
		return true;
	}
	public boolean validfname(String flightName) throws InvalidFlightException{
		if(flightName==null) {
			 throw new InvalidFlightException("The flight name " + flightName + " is invalid");
        }
		if(!(flightName.equals("spicejet")||flightName.equals("vistra")||flightName.equals("Indigo")||flightName.equals("air arabia"))){
			throw new InvalidFlightException("The flight name " + flightName + " is invalid");
		}
		return true;
		}
	public boolean validpcount(int passengercount,String flightName) throws InvalidFlightException{
		int max=getMaxCapacity(flightName);
		if(passengercount<=0||passengercount>max) {
			 throw new InvalidFlightException(
	                    "The passenger count " + passengercount + " is invalid for " + flightName );
			 
		}
		return true;
	}
	public double calculateftftank(String flightName, double currentFuelLevel) throws InvalidFlightException{
		double capacity=getFuelCapacity(flightName);
		if(currentFuelLevel<0||currentFuelLevel>capacity) {
			throw new InvalidFlightException("Invalid fuel level for " + flightName);
        }
		return capacity-currentFuelLevel;

		}
	private int getMaxCapacity(String flightName) {
		if(flightName.equals("spicejet")) return 396;
		if(flightName.equals("vistara")) return 615;
		if(flightName.equals("indigo")) return 396;
		return 130;
				
	}
	private double getFuelCapacity(String flightName) {
		if(flightName.equals("spicejet")) return 200000.0;
		if(flightName.equals("vistara")) return 300000.0;
		if(flightName.equals("indigo")) return 250000.0;
		return 150000.0;
	}
	public void validatePassengerCount(int passengercount, String flightName) {
		// TODO Auto-generated method stub
		
	}
	}
public class main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		FlightUtil util= new FlightUtil();
		System.out.println("enter flight details");
		String input= sc.nextLine();
		try {
			String[] parts= input.split(":");
			 String flightNumber = parts[0];
	            String flightName = parts[1];
	            int passengercount = Integer.parseInt(parts[2]);
	            double currentFuel = Double.parseDouble(parts[3]);

	            util.validateFlightNumber(flightNumber);
	            util.validateFlightNumber(flightName);
	            util.validatePassengerCount(passengercount, flightName);

	            double fuelNeeded = util.calculateftftank(flightName, currentFuel);

	            System.out.println("Fuel required to fill the tank: " + fuelNeeded + " liters");

	        } catch (InvalidFlightException e) {
	            System.out.println(e.getMessage());
	        } catch (Exception e) {
	            // for any unexpected input issues (like missing fields)
	            System.out.println("Invalid Input");
	        }

	        sc.close();
		}
	}


	
