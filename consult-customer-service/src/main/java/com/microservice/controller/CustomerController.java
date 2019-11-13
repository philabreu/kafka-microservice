package com.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {

	
	@GetMapping
	public ResponseEntity<?> findAll(){
		return null;
	}
	
}
