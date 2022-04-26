package br.com.rd.queroserdev.dao;

import javax.persistence.EntityManager;

import br.com.rd.queroserdev.loja.modelo.Categoria;

public class CategoriaDAO {
	
	private EntityManager em;
	
	public CategoriaDAO(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Categoria categoria) {
		em.persist(categoria);
	}
}
