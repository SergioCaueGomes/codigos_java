package br.com.rd.queroserdev.sergio.loja.lojaSergios.repository;

import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.sergio.loja.lojaSergios.model.Categoria;

@Repository
public interface CategoriaRepository {
	
	Categoria findByCategoria(String Categoria);
}



	
