package br.com.rd.queroserdev.sergio.loja.lojaSergios.repository;

import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.sergio.loja.lojaSergios.model.Produto;

@Repository
public interface ProdutoRepository {
	
	Produto findByProduto(String Produto);

	void save(Produto produto);
}

