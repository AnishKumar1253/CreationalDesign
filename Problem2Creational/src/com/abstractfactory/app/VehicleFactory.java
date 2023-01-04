package com.abstractfactory.app;

public class VehicleFactory {

	public static Vehicle getVehicle(VehicleAbstractFactory factory) {
		return factory.createVehicle();
	}
}
