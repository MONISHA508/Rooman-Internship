package com.car.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.model.Car;
import com.car.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	CarRepository carRepository;
	
	@Override
	public List<Car> getAllCars() {
	    
		List<Car> cars = new ArrayList<>();
		carRepository.findAll().forEach(cars::add);
		return cars;
	}
	
	@Override
	public Car getCarById(int id) {
		return carRepository.findById(id).get();
	}
	
	@Override
	public Car insert(Car product) {
		
		return carRepository.save(product);
	}
	
	@Override
	public void updateCar(int id, Car product) {
		
		Car p = carRepository.findById(id).get();
		p.setCarname(product.getCarname());
		p.setPrice(product.getPrice());
		p.setYear(product.getYear());
		carRepository.save(p);
		
	}
	
	@Override
	public void deleteCar(int id) {
		
		carRepository.deleteById(id);
	}
	
}
