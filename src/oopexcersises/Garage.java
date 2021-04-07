package oopexcersises;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private List <Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public boolean addVehicle( Vehicle a) {
		return this.vehicles.add(a);
	}
	
	public void bill() {
		for(Vehicle a: vehicles) {
			
			
		}
		
	}
	

}
