package br.com.rd.queroserdev.dao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.rd.queroserdev.loja.modelo.Pedido;

public class PedidoDAO {
	
	
	public PedidoDAO(EntityManager em) {
		this.em = em;
	}
	
	private EntityManager em;
	
	public void cadastrar(Pedido pedido) {
		em.persist(pedido);
	}
	
	public BigDecimal valorTotalVendido(BigDecimal valorTotal) {
		String jpql = "select sum(pd.valor_total) from Pedido pd where pd.valor_total = :valor_total";
		return em.createQuery(jpql, BigDecimal.class)
				.setParameter("valor_total", valorTotal)
				.getSingleResult();
	}
	
	public buscarPedidoComCliente() {
		
	}
}
