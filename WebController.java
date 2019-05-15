package com.carrest.carrestapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@RequestMapping("/hello1")
	public Car Sample() {
		Car response = new Car();
		response.setManufacturer("Honda");
		response.setCarname("Accord");
		return response;

	}
	
	
	@RequestMapping("/hello")
	public CarResponse Carlist() {
		CarResponse response = new CarResponse();
		Car a = new Car();
		Car b = new Car();
		
		List<Car> addlist= new ArrayList();
		
		
		a.setManufacturer("Honda");
		a.setCarname("Accord");
		b.setManufacturer("Perodua");
		b.setCarname("Myvi SE 1.5");
		
		
		addlist.add(a);
		addlist.add(b);
		
		response.setGetcars(addlist);
		return response;

	}
	

}