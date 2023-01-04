package com.abstractfactory.app;

public class BMWFactory implements VehicleAbstractFactory {

	private String model;
	private String regNo;
	private Integer makeYear;
	private String[] specialFeatures;
	
	

	public BMWFactory(String model, String regNo, Integer makeYear, String[] specialFeatures) {
		super();
		this.model = model;
		this.regNo = regNo;
		this.makeYear = makeYear;
		this.specialFeatures = specialFeatures;
	}



	@Override
	public Vehicle createVehicle() {
		return new BMW(model, regNo, makeYear, specialFeatures);
	}
}
