package br.com.rd.queroserdev.sergio.loja.lojaSergios.dto;

import java.math.BigDecimal;

import br.com.rd.queroserdev.sergio.loja.lojaSergios.model.Produto;

public class NovoProduto {

	public NovoProduto() {
		// TODO Auto-generated constructor stub
	}
	
	private Long id;
	private String nome;
	private String tamanho;
	private BigDecimal preco;
	private Long quantidade;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "NovoProduto [id=" + id + ", nome=" + nome + ", tamanho=" + tamanho + ", preco=" + preco
				+ ", quantidade=" + quantidade + "]";
	}
	public Produto toProduto() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
