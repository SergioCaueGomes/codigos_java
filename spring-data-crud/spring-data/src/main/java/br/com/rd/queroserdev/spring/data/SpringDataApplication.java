package br.com.rd.queroserdev.spring.data;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.rd.queroserdev.spring.data.service.CargoService;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

	private CargoService cargoService;
	private Boolean sistema = true;

	public SpringDataApplication(CargoService cargoService) {
		this.cargoService = cargoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int acao;
		
		while(sistema) {
			System.out.println("Qual a ação que será executada?");
			System.out.println("0 - Sair");
			System.out.println("1 - Gestão de Cargos");
			
			acao = sc.nextInt();
			if(acao == 1) {
				cargoService.iniciar(sc);
			}else {
				sistema = false;
			}
		}
		sc.close();
	}
}
