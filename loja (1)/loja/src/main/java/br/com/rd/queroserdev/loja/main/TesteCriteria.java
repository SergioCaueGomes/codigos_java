package br.com.rd.queroserdev.loja.main;

import java.math.BigDecimal;

import br.com.rd.queroserdev.loja.modelo.Categoria;
import br.com.rd.queroserdev.loja.modelo.Produto;

public class TesteCriteria {

	public static void main(String[] args) {
		popularBancoDeDados();
		
	}

	private static void popularBancoDeDados() {
		Categoria celulares = new Categoria("CELULARES");
		Categoria videogames = new Categoria("VIDEOGAMES");
		Categoria informatica = new Categoria("INFORMATICA");
		
		Produto celular = new Produto("Xiaomi Redmi",  "Redmi 10 Pro", new BigDecimal(4000), celulares);
		Produto videogame = new Produto("PS5",  "Playstation 5", new BigDecimal(5000), videogames);
		Produto macbook = new Produto("Macbook",  "Macbook Pro", new BigDecimal(10000), informatica);
		
		
	}

}
