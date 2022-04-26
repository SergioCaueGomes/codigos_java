package br.com.rd.queroserdev.sergio.loja.lojaSergios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rd.queroserdev.sergio.loja.lojaSergios.dto.NovoPedido;
import br.com.rd.queroserdev.sergio.loja.lojaSergios.dto.NovoProduto;
import br.com.rd.queroserdev.sergio.loja.lojaSergios.model.Cliente;
import br.com.rd.queroserdev.sergio.loja.lojaSergios.model.Pedido;
import br.com.rd.queroserdev.sergio.loja.lojaSergios.model.Produto;
import br.com.rd.queroserdev.sergio.loja.lojaSergios.repository.ClienteRepository;
import br.com.rd.queroserdev.sergio.loja.lojaSergios.repository.PedidoRepository;
import br.com.rd.queroserdev.sergio.loja.lojaSergios.repository.ProdutoRepository;


@Controller
@RequestMapping("produtos")
public class ProdutoController {

	public ProdutoController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private ProdutoRepository ProdutoRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("formulario")
	public String formulario(NovoProduto requisicao) {
		return "produtos/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Validated NovoProduto requisicao, BindingResult result) {
		if(result.hasErrors()) {
			return "produtos/formulario";
		}
		
	
		Produto produto = requisicao.toProduto();
		produto.setNome("nome");
		ProdutoRepository.save(produto);
		return "redirect:/home";
		
}
