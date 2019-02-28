package com.example.main;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VehicleController {
	
	@Autowired
	VehicleService vs;


	@RequestMapping("/vehicles")
	public List<Vehicle> getAll(){
		return vs.getAll();
	}
	
	@RequestMapping("/vehicles/{id}")
	public Vehicle getVehicle(@PathVariable("id") Integer id) {
		Vehicle res = vs.getVehicle(id);
		if (res==null) throw new VehicleNotFoundException();
		return res;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/vehicles")
	public void addVehicle(@RequestBody Vehicle vehicle) {
		vs.addVehicle(vehicle);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/vehicles/{id}")
	public void updateVehicle(@RequestBody Vehicle vehicle, @PathVariable int id) {
		vs.updateVehicle(vehicle, id);
	}	
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/vehicles")
	public void deleteAll() {
		vs.deleteAll();
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/vehicles/{id}")
	public void deleteVehicle(@PathVariable int id) {
		if (vs.deleteVehicle(id)==false) throw new VehicleNotFoundException();
	}	

}
