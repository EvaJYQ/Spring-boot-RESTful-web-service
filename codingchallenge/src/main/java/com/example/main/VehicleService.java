package com.example.main;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class VehicleService {
	
	@Autowired
	VehicleRepository vr;
	

	public VehicleService() {
		
	}
	public Vehicle getVehicle(int id) {
		return  vr.findById(id);
	
	}
	public List<Vehicle> getAll() {
		List<Vehicle> vehicles = new ArrayList<>();
		vr.findAll().forEach(vehicles::add);		
		return vehicles;
	}	
	
	public void addVehicle(Vehicle v) {
		vr.save(v);
	}
	public void updateVehicle(Vehicle v, int id) {
		vr.save(v);
	}
	public boolean deleteVehicle(int id) {
		if (getVehicle(id)!=null) {
			vr.deleteById(id);
			return true;
		}
		return false;
	}
	public void deleteAll() {
		vr.deleteAll();
	}
}
