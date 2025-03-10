package com.car.service;

import java.util.List;

import com.car.model.Car;

public interface CarService {

	List<Car> getAllCars();

	Car getCarById(int id);
	
	Car insert(Car car);
	
	void updateCar(int id,Car car);
	
	void deleteCar(int id);
}
