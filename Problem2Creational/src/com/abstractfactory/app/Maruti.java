package com.abstractfactory.app;

import java.util.Arrays;

public class Maruti extends Vehicle {
	
	private String model;
	private String regNo;
	private Integer makeYear;
	private String[] specialFeatures;
	
	public Maruti(String model, String regNo, Integer makeYear, String[] specialFeatures) {
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

	@Override
	public String toString() {
		return "Maruti [model=" + model + ", regNo=" + regNo + ", makeYear=" + makeYear + ", specialFeatures="
				+ Arrays.toString(specialFeatures) + "]";
	}
	
	
	
}
