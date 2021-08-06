package com.techlab.model;

public class CarServices implements VehicleServices {
	private int price;

	public CarServices(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		return price;
	}
}
