package com.AssesmentProblemOceanfeet;
import java.util.*;

public class VesselUtil extends Vessel{
	
	private List<Vessel>vesselList= new ArrayList<>();
	VesselUtil(String vesselId, String vesselName, double averageSpeed,String vesselType){
		super(vesselId, vesselName, averageSpeed,vesselType);
	}
	public VesselUtil(){}
	public List<Vessel> getVesselList(){
		return vesselList;
	}
    public void addVesselPerformane(Vessel vessel) {
    	if(!vesselList.contains(vessel)) {
    		vesselList.add(vessel);
    	}
    }
    public Vessel getVesselById(String vesselId) {

        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }

        return null;
    }

 
    public List<Vessel> getHighPerformanceVessels(){
    	  List<Vessel> finalList= new ArrayList<>();
    	double maxSpeed = Double.MIN_VALUE;
    	for(Vessel v:vesselList) {
    		if(v.getAverageSpeed()>maxSpeed) {
    			maxSpeed=v.getAverageSpeed();
    		}}
    		for(Vessel v: vesselList) {
    			if(v.getAverageSpeed()==maxSpeed) {
    				finalList.add(v);
    			}
    		}
    		return finalList;
    	}
    }

