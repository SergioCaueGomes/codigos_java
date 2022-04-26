package br.com.rd.queroserdev.sergio.loja.lojaSergios.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import br.com.rd.queroserdev.sergio.loja.lojaSergios.model.Cliente;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = true, name="id_pedido")
	private Long idPedido;
	
	@Column(nullable = true, name="nome_produto")
	private String nomeProduto;
	
	@Column(nullable = true, name="quantidade")
	private Long quantidade;
	
	@Column(nullable = true, name="preco_unitario")
	private BigDecimal precoUnitario;
	
	@Column(nullable = true, name="valor_total")
	private BigDecimal valorTotal;

	
	@ManyToOne
	private Cliente cliente;
	
	@OneToMany
	private Produto produto;
	

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", nomeProduto=" + nomeProduto + ", quantidade=" + quantidade
				+ ", precoUnitario=" + precoUnitario + ", valorTotal=" + valorTotal + ", cliente=" + cliente + "]";
	}
	
	
	
	
	
}
