package com.dev.sergio.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.sergio.aula.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	
}
