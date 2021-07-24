package com.helloworl.hellow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping ("/hellow")
public class HelooController {
	@GetMapping 
	public String hello() {
		return "mentalidade de crescimento e persistencia ";
		
	}

}
