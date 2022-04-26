package com.dev.sergio.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.sergio.aula.dto.UsuarioDTO;
import com.dev.sergio.aula.entities.Usuario;
import com.dev.sergio.aula.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	@Transactional(readOnly = true)
	public UsuarioDTO findById(Long id) {
		Usuario entity = repository.findById(id).get();
		UsuarioDTO dto = new UsuarioDTO(entity);
		return dto;
	}
}
