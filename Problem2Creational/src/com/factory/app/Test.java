package com.factory.app;

import java.util.Arrays;

public class Test {
	
	public static void main(String args[]) {

		String[] specialFeatures=new String[2];
		specialFeatures[0]="500bhp";
		specialFeatures[1]="1000cc";
	
		Vehicle v1=VehicleFactory.getVehicle("Maruti", "maruti-baleno",
				"GJ122", 2012, specialFeatures);
		System.out.println(v1.getModel());
		

		specialFeatures[0]="2000bhp";
		specialFeatures[1]="3000cc";
		Vehicle v2=VehicleFactory.getVehicle("BMW", "BMWx3",
				"GJ1223", 2022, specialFeatures);
		System.out.println(v2.getMakeYear());
		

		specialFeatures[0]="4000bhp";
		specialFeatures[1]="7000cc";
		Vehicle v3=VehicleFactory.getVehicle("Tata", "Tata Nexon",
				"MH122", 2002, specialFeatures);
		System.out.println(Arrays.toString(v3.getSpecialFeatures()));
		
	
	
	}
	
}
