package com.techlab.model;

public class TireServicesDecorator implements VehicleServices{
	private VehicleServices vs;
	private int tireServicing = 1500;
	
	public TireServicesDecorator(VehicleServices vs) {
		this.vs = vs;
	}

	@Override
	public int getPrice() {
		return vs.getPrice() + this.tireServicing;
	}
}
