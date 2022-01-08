package com.verzel.catalogodecarrosapi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verzel.catalogodecarrosapi.domain.repository.CarroRepository;

@RestController
@RequestMapping(value = "/carros")
public class CarroController {
	
	@Autowired
	private CarroRepository carroRepository;
	
	
	

}
