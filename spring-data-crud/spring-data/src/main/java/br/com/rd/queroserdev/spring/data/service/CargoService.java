package br.com.rd.queroserdev.spring.data.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import org.springframework.stereotype.Service;

import br.com.rd.queroserdev.spring.data.orm.Cargo;
import br.com.rd.queroserdev.spring.data.repository.CargoRepository;
@Service
public class CargoService {
	private final CargoRepository cargoRepository;
	private Boolean sistema = true;

	public CargoService(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}

	public void iniciar(Scanner sc) {
		int acao;

		while (sistema) {
			System.out.println("Qual a ação que será realizada no Cargo");
			System.out.println("0 - Sair");
			System.out.println("1 - Salvar");
			System.out.println("2 - Atualizar");
			System.out.println("3 - Visualizar");
			System.out.println("4 - Deletar");

			acao = sc.nextInt();

			switch (acao) {
			case 1:
				salvar(sc);
				break;
			case 2:
				atualizar(sc);
				break;
			case 3:
				visualizar();
				break;
			case 4:
				deletar(sc);
				break;
			default:
				sistema = false;
				break;
			}
		}
	}

	private void deletar(Scanner sc) {
		int id;
		System.out.println("Informe o ID do Cargo a ser Deletado");
		
		id = sc.nextInt();
		
		cargoRepository.deleteById(id);
		
		System.out.println("Cargo deletado com sucesso");

	}

	private void visualizar() {
		Iterable<Cargo> cargos = cargoRepository.findAll();
		cargos.forEach(cargo -> System.out.println(cargo));
	}

	private void atualizar(Scanner sc) {
		int id;
		String descricao;
		
		System.out.println("Informe o Id do registro a ser atualizado");
		id = sc.nextInt();
		
		System.out.println("Informe a nova descrição para o Cargo");
		descricao = sc.next();
		
		Cargo cargo = new Cargo();
		cargo.setId(id);
		cargo.setDescricao(descricao);
		
		cargoRepository.save(cargo);
		
		System.out.println("Cargo Atualizado com Sucesso");

	}

	private void salvar(Scanner sc) {
		System.out.println("Informe a Descrição do Cargo");
		String descricao = sc.next();

		Cargo cargo = new Cargo();
		cargo.setDescricao(descricao);

		cargoRepository.save(cargo);

		System.out.println("Cargo Salvo com Sucesso");

	}

}
