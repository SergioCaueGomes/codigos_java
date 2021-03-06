package com.dev.sergio.aula.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.sergio.aula.dto.UsuarioDTO;
import com.dev.sergio.aula.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;

	@GetMapping(value = "/{id}")
	public UsuarioDTO findById(@PathVariable Long id){
		return service.findById(id);
	}

}
