package com.oimundo.mundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/mundo")
public class OiController {
@GetMapping
public String mundo () {
	return "quero me aprofundar em banco de dados entender os termos tecnicos,"
			+ "e mais sobre poo ";
	
}


}