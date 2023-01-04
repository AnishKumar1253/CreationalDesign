package com.factory.app;



public class BMW extends Vehicle {

	private String model;
	private String regNo;
	private Integer makeYear;
	private String[] specialFeatures;
	
	public BMW(String model, String regNo, Integer makeYear, String[] specialFeatures) {
		super();
		this.model = model;
		this.regNo = regNo;
		this.makeYear = makeYear;
		this.specialFeatures = specialFeatures;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return this.model;
	}

	@Override
	public Integer getMakeYear() {
		// TODO Auto-generated method stub
		return this.makeYear;
	}

	@Override
	public String getRegNo() {
		// TODO Auto-generated method stub
		return this.regNo;
	}

	@Override
	public String[] getSpecialFeatures() {
		// TODO Auto-generated method stub
		return this.specialFeatures;
	}
	
	
}
