package com.example.CarService.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;


@Controller
public class AttendentController {

	@GetMapping("/attendent/{attendentId}")
	public String getAttendent(@PathVariable("attendentId") String attendentId, ModelMap map) {
		// Write your Logic here
		map.addAttribute("name", "Vishal");
		map.addAttribute("speciality", "Body,Handbreak");
		return "attendent";

	}

}
