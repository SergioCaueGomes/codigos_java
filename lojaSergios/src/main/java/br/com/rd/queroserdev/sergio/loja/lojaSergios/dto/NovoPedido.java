package br.com.rd.queroserdev.sergio.loja.lojaSergios.dto;

import java.math.BigDecimal;

import br.com.rd.queroserdev.sergio.loja.lojaSergios.model.Cliente;
import br.com.rd.queroserdev.sergio.loja.lojaSergios.model.Pedido;



public class NovoPedido {

	public NovoPedido() {
		// TODO Auto-generated constructor stub
	}
	
	private String nomeProduto;
	private Long quantidade;
	private BigDecimal precoUnitario;
	private BigDecimal valorTotal;

	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeProduto);
		pedido.setQuantidade(quantidade);
		pedido.setPrecoUnitario(precoUnitario);
		pedido.setValorTotal(valorTotal);
		return pedido;
		
	}
	
}
