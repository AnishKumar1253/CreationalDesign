package com.factory.app;


public class VehicleFactory {
	
	public static Vehicle getVehicle(String type,String model,String regNo,
			Integer makeYear,String[] specialFeatures) {
		if("Maruti".equalsIgnoreCase(type))
			return new Maruti(model,regNo,makeYear,specialFeatures);
		else if("BMW".equalsIgnoreCase(type))
			return new BMW(model,regNo,makeYear,specialFeatures);
		else if("Tata".equalsIgnoreCase(type))
			return new Tata(model,regNo,makeYear,specialFeatures);
		else
			return null;
	}
}
