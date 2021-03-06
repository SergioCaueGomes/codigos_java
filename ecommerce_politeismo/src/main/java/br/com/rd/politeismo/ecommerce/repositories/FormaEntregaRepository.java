package br.com.rd.politeismo.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.politeismo.ecommerce.orm.FormaEntrega ;

@Repository
public interface FormaEntregaRepository  extends JpaRepository<FormaEntrega, Long>, CrudRepository<FormaEntrega, Long> {
	
	public List<FormaEntrega> findAll();

}
