package br.com.rd.queroserdev.spring.data.orm;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Cargo cargo;
	
	@Column(nullable = false)
	private String cpf;
	
	
	@Column(nullable = false)
	private LocalDate data_contratacao = LocalDate.now();

	
	public Funcionario() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getData_contratacao() {
		return data_contratacao;
	}

	public void setData_contratacao(LocalDate data_contratacao) {
		this.data_contratacao = data_contratacao;
	}


	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", cargo=" + cargo + ", cpf=" + cpf + ", data_contratacao="
				+ data_contratacao + "]";
	}
	
}
