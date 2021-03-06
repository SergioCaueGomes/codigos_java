package br.com.rd.politeismo.ecommerce.orm;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import br.com.rd.politeismo.ecommerce.orm.DepartamentoCategoria;
import br.com.rd.politeismo.ecommerce.orm.Produto;


@Entity
@Table(name = "CATEGORIA")
public class Categoria {
	
	@Id
	@Column(name= "id_categoria")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(name= "fl_inativo")
	private boolean flInativo = true; // flag inativo
	
	
	
	@OneToMany
	private DepartamentoCategoria departamentoCategoria;
	
	private List<Departamento> departamento;
	private List<Produto> produto;
	
	
	
	
	
	public Categoria() {
		
	}

	public Long getId_categoria() {
		return id;
	}
	
	public void setId_categoria(Long id_categoria) {
		this.id = id_categoria;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Departamento> getDepartamento() {
		return departamento;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	@Override
	public String toString() {
		return "Categoria [ID: " + id + ", Nome: " + nome + ", Departamento: " + departamento + "]";
	}

}
