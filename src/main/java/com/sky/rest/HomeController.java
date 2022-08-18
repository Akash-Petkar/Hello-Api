package com.sky.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/get/{name}")
	public String getMessage(@PathVariable("name") String name)
	{
		return "Hii Welcome "+name;
	}
}
