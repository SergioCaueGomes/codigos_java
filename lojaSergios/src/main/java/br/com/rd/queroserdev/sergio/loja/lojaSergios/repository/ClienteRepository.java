package br.com.rd.queroserdev.sergio.loja.lojaSergios.repository;

import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.sergio.loja.lojaSergios.model.Cliente;

@Repository
public interface ClienteRepository {
	
	Cliente findByCliente(String Cliente);
}

