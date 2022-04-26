package br.com.rd.queroserdev.sergio.loja.lojaSergios.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "tb_produto")
public class Produto {

	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name= "id_produto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name= "nome")
	private String nome;
	
	@Column(name= "tamanho")
	private String tamanho;
	
	@Column(name= "preco")
	private BigDecimal preco;
	
	@Column(name= "quantidade")
	private Long quantidade;
	
	@ManyToOne
	private Pedido pedido;
	
	@ManyToOne
	private Categoria categoria;

	
	private List<Produto> produtos;
	
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
	
	
}
