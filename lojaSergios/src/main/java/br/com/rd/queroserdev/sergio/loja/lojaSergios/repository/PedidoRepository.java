package br.com.rd.queroserdev.sergio.loja.lojaSergios.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.sergio.loja.lojaSergios.model.Pedido;

@Repository
public interface PedidoRepository {
	
	Pedido findByCategoria(String Pedido);

	List<Pedido> findAllByCliente(String name);

}
