package br.com.rd.queroserdev.spring.data.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "UnidadeTrabalho")
public class UnidadeTrabalho {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String endereco;
	
	@Column(nullable = true)
	private String descricao;
	
	@OneToMany
	private Cargo cargo;
	
	@OneToMany
	private Funcionario funcion;
	

	public UnidadeTrabalho() {
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "UnidadeTrabalho [id=" + id + ", endereco=" + endereco + ", descricao=" + descricao + "]";
	}
	

}
