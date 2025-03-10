package com.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.model.Car;
import com.car.service.CarService;

@RestController
@RequestMapping("/api/car")
public class CarController {

	@Autowired
	CarService carService;
	
	//implement the logic for getting all cars
	@GetMapping("/listOfCars")
	
	public ResponseEntity<List<Car>> getAllCars()
	{
	  List<Car> products =  carService.getAllCars();
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
	
	//Implements the logic for getting a specific car
		@GetMapping({"/getById/{id}"})
		public ResponseEntity<Car> getProduct(@PathVariable Integer id)
		{
			return new ResponseEntity<>(carService.getCarById(id),HttpStatus.OK);
			
		}
		
		//IMPLEMET THE LOGIC FOR INSERT PRODUCT DATA
		@PostMapping("/addCar")
		public ResponseEntity<Car> saveProduct(@RequestBody Car car)
		{
			Car p = carService.insert(car);
			HttpHeaders headers = new HttpHeaders();
			headers.add("car", "/api/car/addCar/"+p.getId());
			return new ResponseEntity<>(p,headers,HttpStatus.OK);
			
		}

		//update logic
		@PutMapping({"/updateCar/{id}"})
		public ResponseEntity<Car> updateProduct(@PathVariable("id") Integer id , @RequestBody Car car)
		{
			carService.updateCar(id, car);
			return new ResponseEntity<>(carService.getCarById(id),HttpStatus.OK);
			
		}
		
		//delete logic
		@DeleteMapping({"/deleteCar/{id}"})
		public ResponseEntity<Car> deleteProduct(@PathVariable("id") Integer id)
		{
			carService.deleteCar(id);
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
	
}
