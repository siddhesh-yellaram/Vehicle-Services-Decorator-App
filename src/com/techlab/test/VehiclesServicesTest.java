package com.techlab.test;

import com.techlab.model.BikeServices;
import com.techlab.model.CarServices;
import com.techlab.model.EngineServicesDecorator;
import com.techlab.model.TireServicesDecorator;
import com.techlab.model.VehicleServices;

public class VehiclesServicesTest {

	public static void main(String[] args) {
		VehicleServices stdCarService = new CarServices(2000);
		VehicleServices stdBikeService = new BikeServices(2000);
		VehicleServices enginceCarService = new EngineServicesDecorator(stdCarService);
		VehicleServices engineBikeService = new EngineServicesDecorator(stdBikeService);
		VehicleServices tireEnginceCarService = new TireServicesDecorator(new EngineServicesDecorator(new CarServices(5000)));
		VehicleServices tireEngineBikeService = new TireServicesDecorator(new EngineServicesDecorator(new BikeServices(3500)));
		
		System.out.println("Standard Car Servicing Price: "+stdCarService.getPrice());
		System.out.println("Standard Bike Servicing Price: "+stdBikeService.getPrice());
		System.out.println("Car Engine Servicing Price: "+enginceCarService.getPrice());
		System.out.println("Bike Engine Servicing Price: "+engineBikeService.getPrice());
		System.out.println("Car Engine & Tire Servicing Price: "+tireEnginceCarService.getPrice());
		System.out.println("Bike Engine & Tire Servicing Price: "+tireEngineBikeService.getPrice());
	}

}
