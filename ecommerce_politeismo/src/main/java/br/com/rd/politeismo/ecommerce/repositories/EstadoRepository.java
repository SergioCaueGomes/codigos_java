package br.com.rd.politeismo.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.politeismo.ecommerce.orm.Estado;

@Repository
public interface EstadoRepository  extends JpaRepository<Estado, Long>, CrudRepository<Estado, Long>{
	
	public List<Estado> findAll();

}
