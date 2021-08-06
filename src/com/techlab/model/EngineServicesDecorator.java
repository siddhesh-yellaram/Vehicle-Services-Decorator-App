package com.techlab.model;

public class EngineServicesDecorator implements VehicleServices{
	private VehicleServices vs;
	private int engineServicing = 2000;
	
	public EngineServicesDecorator(VehicleServices vs) {
		this.vs = vs;
	}

	@Override
	public int getPrice() {
		return vs.getPrice() + this.engineServicing;
	}
	
	
}
