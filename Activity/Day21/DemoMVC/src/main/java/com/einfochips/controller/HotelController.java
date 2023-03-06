package com.einfochips.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {
	
	@RequestMapping("main")
	public String getMainCourse() {
		return "South Indian Dishes";
	}
	
	@RequestMapping("dinner")
	public String getDinner() {
		return "Punjabi Dish";
	}
	
	

}
