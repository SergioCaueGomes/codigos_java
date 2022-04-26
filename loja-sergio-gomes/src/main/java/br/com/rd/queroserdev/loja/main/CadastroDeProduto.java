package br.com.rd.queroserdev.loja.main;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.rd.queroserdev.dao.CategoriaDAO;
import br.com.rd.queroserdev.dao.ProdutoDAO;
import br.com.rd.queroserdev.loja.modelo.Categoria;
import br.com.rd.queroserdev.loja.modelo.Produto;
import br.com.rd.queroserdev.util.JPAUtil;

public class CadastroDeProduto {
	
	public static void main(String[] args) {
		cadastrarProduto();
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDAO produtoDao = new ProdutoDAO(em);
		
		System.out.println("BUSCAR TODOS");
		List<Produto> p = produtoDao.buscarTodos();
		System.out.println(p);
		
		System.out.println("");
		
		System.out.println("BUSCAR POR ID");
		Produto produto = produtoDao.buscarPorId(1l);
		System.out.println(produto.getPreco());
		
		System.out.println("");
		
		System.out.println("BUSCAR POR NOME DA CATEGORIA");
		List<Produto> todos = produtoDao.buscarPorNomeDaCategoria("CELULARES");
		todos.forEach(p2 -> System.out.println(p2.getNome()));
		
		System.out.println("");
		
		System.out.println("BUSCAR PREÇO");
		BigDecimal precoDoProduto  = produtoDao.buscarPrecoDoProdutoComNome("Motorola  Edge 20");
		System.out.println("Preço do Produto.: " + precoDoProduto);
	}

	private static void cadastrarProduto() {
		Categoria celulares =  new Categoria("CELULARES");
		Produto celular = new Produto("Motorola  Edge 20", "Celular Motorola 5G", new BigDecimal(5000), celulares);
		
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDAO produtoDao = new ProdutoDAO(em);
		CategoriaDAO categoriaDao = new CategoriaDAO(em);
		
		em.getTransaction().begin();
			categoriaDao.cadastrar(celulares);
			produtoDao.cadastrar(celular);
		em.getTransaction().commit();
		
		em.close();
		
		
	}

}
