package br.com.rd.queroserdev.dao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.rd.queroserdev.loja.modelo.Produto;

	public class ProdutoDAO {
	
	private EntityManager em;
	
	public ProdutoDAO(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Produto produto) {
		em.persist(produto);
		
	}
	
	public void atualizar(Produto produto) {
		em.merge(produto);
		
	}
	
	public void remover(Produto produto) {
		this.em.remove(produto);
	}
	
	public Produto buscarPorId(Long id) {
		return em.find(Produto.class,id);
	}
	
	public List<Produto> buscarTodos() {
		String jpql = "select p from Produto p ";
		return em.createQuery(jpql,Produto.class).getResultList();
	}
	
	public List<Produto> buscarPorNome(String nome){
		String jpql = "select p from Produto where p.nome = :nome";
		return em.createQuery(jpql, Produto.class)
				.setParameter("nome", nome)
				.getResultList();
	}

	public List<Produto> buscarPorNomeDaCategoria(String nome) {
		return em.createNamedQuery("Produto.produtosPorCategoria", Produto.class)
				.setParameter("nome", nome)
				.getResultList();
	}

	public BigDecimal buscarPrecoDoProdutoComNome(String nome) {
		String jpql = "select p.preco from Produto p where p.nome = :nome";
		return em.createQuery(jpql, BigDecimal.class)
				.setParameter("nome", nome)
				.getSingleResult();
	}
	
	public List<Produto> buscarProdutoParametros(String nome, BigDecimal preco, LocalDate data){
		String jpql  = "select p from produtos p where 1=1 ";
		if(nome != null && !nome.trim().isEmpty()) {
			jpql = " and p.nome = :nome ";
		}
		if(preco != null) {
			jpql = " and p.preco = :preco ";
		}
		if(data != null) {
			jpql = " and p.data = :data ";
		}
		TypedQuery<Produto> query = em.createQuery(jpql,Produto.class);
		if(nome != null && !nome.trim().isEmpty()) {
			query.setParameter("nome", nome);
		}
		if(preco != null) {
			query.setParameter("preco", preco);
		}
		if(data != null) {
			query.setParameter("data", data);
		}
		
		return query.getResultList();
	}
	
	public List<Produto>  buscarPorParametroComCriteria(String nome, BigDecimal preco, LocalDate data){
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Produto> query = builder.createQuery(Produto.class);
		Root<Produto> from = query.from(Produto.class);
		
		Predicate filtros  = builder.and();
		if(nome != null && !nome.trim().isEmpty()) {
			filtros = builder.and(filtros, builder.equal(from.get("nome"), nome));
		}
		if(preco != null) {
			filtros = builder.and(filtros, builder.equal(from.get("preco"), preco));
		}
		if(data != null) {
			filtros = builder.and(filtros, builder.equal(from.get("data"), data));
		}
		
		query.where(filtros);
		
		return em.createQuery(query).getResultList();
		
	}
	
}
