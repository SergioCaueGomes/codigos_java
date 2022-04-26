package com.dev.sergio.aula.dto;

import com.dev.sergio.aula.entities.Usuario;

public class UsuarioDTO {

	private Long id;
	private String name;
	
	public UsuarioDTO() {
		
	}

	public UsuarioDTO(Long id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public UsuarioDTO(Usuario usuario) {
		
		id = usuario.getId();
		name = usuario.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
