package com.techlab.model;

public class BikeServices implements VehicleServices{
	private int price;
	
	public BikeServices(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		return price;
	}
	
}
