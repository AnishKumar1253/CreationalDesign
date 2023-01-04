package com.abstractfactory.app;

public class test {

	public static void main(String[] args) {
		
		
		String[] specialFeatures=new String[2];
		specialFeatures[0]="520bhp";
		specialFeatures[1]="1200cc";
		MarutiFactory mfactory=new MarutiFactory("nexon","DL1253", 
				2010, specialFeatures);
		Vehicle v1=VehicleFactory.getVehicle(mfactory);
		
		System.out.println(v1);
		
		specialFeatures[0]="750bhp";
		specialFeatures[1]="2500cc";
		BMWFactory bfactory=new BMWFactory("audi","DL1223", 
				2022, specialFeatures);
		Vehicle v2=VehicleFactory.getVehicle(bfactory);
		System.out.println(v2);
		
		specialFeatures[0]="800bhp";
		specialFeatures[1]="3500cc";
		TataFactory tfactory=new TataFactory("bmw","DL223", 
				2022, specialFeatures);
		Vehicle v3=VehicleFactory.getVehicle(tfactory);
		System.out.println(v3);

	}

}
