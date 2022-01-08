package com.verzel.catalogodecarrosapi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verzel.catalogodecarrosapi.domain.model.Carro;
import com.verzel.catalogodecarrosapi.domain.repository.CarroRepository;
import com.verzel.catalogodecarrosapi.domain.service.CadastroCarroService;

@RestController
@RequestMapping(value = "/carros")
public class CarroController {
	
	@Autowired
	private CarroRepository carroRepository;
	
	@Autowired
	private CadastroCarroService carroService;
	
	@GetMapping
	public List<Carro> listar(){
		return carroRepository.findAll();
	}
	
	
	
	

}
