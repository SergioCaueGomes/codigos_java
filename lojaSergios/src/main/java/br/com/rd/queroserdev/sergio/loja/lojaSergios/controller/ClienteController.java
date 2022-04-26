package br.com.rd.queroserdev.sergio.loja.lojaSergios.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rd.queroserdev.sergio.loja.lojaSergios.model.Pedido;
import br.com.rd.queroserdev.sergio.loja.lojaSergios.repository.PedidoRepository;

@Controller
@RequestMapping("cliente")
public class ClienteController {

	public ClienteController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("pedido")
	public String home(Model model, Principal principal) {
		List<Pedido> pedidos = pedidoRepository.findAllByCliente(principal.getName());
		model.addAttribute("pedidos", pedidos);
		return "cliente/home";
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/cliente/home";
	}

}
