package com.abstractfactory.app;

public class test {

	public static void main(String[] args) {
		
		
		String[] specialFeatures=new String[2];
		specialFeatures[0]="500bhp";
		specialFeatures[1]="1000cc";
		MarutiFactory mfactory=new MarutiFactory("maruti-baleno","GJ22", 
				2012, specialFeatures);
		Vehicle v1=VehicleFactory.getVehicle(mfactory);
		
		System.out.println(v1);
		
		specialFeatures[0]="700bhp";
		specialFeatures[1]="2000cc";
		BMWFactory bfactory=new BMWFactory("bmwx3","GJ223", 
				2022, specialFeatures);
		Vehicle v2=VehicleFactory.getVehicle(bfactory);
		System.out.println(v2);
		
		specialFeatures[0]="800bhp";
		specialFeatures[1]="3000cc";
		TataFactory tfactory=new TataFactory("bmwx3","GJ223", 
				2022, specialFeatures);
		Vehicle v3=VehicleFactory.getVehicle(tfactory);
		System.out.println(v3);

	}

}
