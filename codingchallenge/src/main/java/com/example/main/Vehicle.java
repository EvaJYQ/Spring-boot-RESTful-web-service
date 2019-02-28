package com.example.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.http.HttpStatus;

@Entity
public class Vehicle {
	
	@Id
	@Column (name="vehicleId")
	private int id; 
	@Column (name="vehicleYear")
	private int year;
	private String make;
	private String model;
	

	public Vehicle(int id,int year,String make,String model) {
		this.id = id;
		this.year = year;
		this.make = make;
		this.model = model;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
