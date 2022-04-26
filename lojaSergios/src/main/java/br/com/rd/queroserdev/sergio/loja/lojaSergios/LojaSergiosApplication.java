package br.com.rd.queroserdev.sergio.loja.lojaSergios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@EnableCaching
@SpringBootApplication
public class LojaSergiosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaSergiosApplication.class, args);
	}

}
