package br.com.rd.queroserdev.sergio.loja.lojaSergios.controller;

import java.security.Principal;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rd.queroserdev.sergio.loja.lojaSergios.dto.NovoPedido;
import br.com.rd.queroserdev.sergio.loja.lojaSergios.model.Cliente;
import br.com.rd.queroserdev.sergio.loja.lojaSergios.model.Pedido;
import br.com.rd.queroserdev.sergio.loja.lojaSergios.repository.ClienteRepository;
import br.com.rd.queroserdev.sergio.loja.lojaSergios.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PedidoController {

	public PedidoController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private ClienteRepository ClienteRepository;

	@GetMapping("formulario")
	public String formulario(NovoPedido requisicao) {
		return "pedido/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Validated NovoPedido requisicao, BindingResult result) {
		if(result.hasErrors()) {
			return "pedido/formulario";
		}
		
		String nome_cliente = SecurityContextHolder.getContext().getAuthentication().getName();
		
		Cliente cliente = ClienteRepository.findByCliente(nome_cliente);
		Pedido pedido = requisicao.toPedido();
		pedido.setCliente(cliente);
		pedidoRepository.save(pedido);
		return "redirect:/home";
		
		
	}


}

