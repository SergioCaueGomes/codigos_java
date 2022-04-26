package br.com.rd.queroserdev.sergio.loja.lojaSergios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = true, name="id_cliente")
	private Long idCliente;
	
	@Column(nullable = true, name="nome_cliente")
	private String nomeCliente;
	
	@Column(nullable = true, name="cpf_cliente")
	private String cpf;
	
	@OneToMany
	private Pedido pedido;
	

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nomeCliente=" + nomeCliente + ", cpf=" + cpf + "]";
	}
	
	
}
