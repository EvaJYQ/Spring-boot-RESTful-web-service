package com.example.main;


import org.springframework.data.repository.CrudRepository;



//@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {
	Vehicle findById(int id);
}
