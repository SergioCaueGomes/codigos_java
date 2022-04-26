package br.com.rd.queroserdev.spring.data.service;

import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.rd.queroserdev.spring.data.orm.UnidadeTrabalho;
import br.com.rd.queroserdev.spring.data.repository.UnidadeTrabalhoRepository;


@Service
public class UnidadeTrabalhoService {

		private UnidadeTrabalhoRepository unidadeRepository;
		private Boolean sistema = true;

		public UnidadeTrabalhoService(UnidadeTrabalhoRepository unidadeRepository) {
			this.unidadeRepository = unidadeRepository;
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
			System.out.println("Informe o ID do Funcionario a ser Deletado");
			
			id = sc.nextInt();
			
			unidadeRepository.deleteById(id);
			
			System.out.println("Funcionario deletado com sucesso");

		}

		private void visualizar() {
			Iterable<UnidadeTrabalho> unidades = unidadeRepository.findAll();
			unidades.forEach(unidade -> System.out.println(unidade));
		}

		private void atualizar(Scanner sc) {
			int id;
			String endereco;
			String descricao;
			
			
			System.out.println("Informe o Id do registro a ser atualizado");
			id = sc.nextInt();
			System.out.println("Informe o endereço da Unidade de Trabalho.");
			endereco = sc.next();
			System.out.println("Informe o descrição da Unidade de Trabalho");
			descricao = sc.next();
			
			
			UnidadeTrabalho unidade = new UnidadeTrabalho();
			unidade.setId(id);
			unidade.setEndereco(endereco);
			unidade.setDescricao(descricao);
			
			
			unidadeRepository.save(unidade);
			
			System.out.println("Unidade de Trabalho Atualizada com Sucesso");

		}

		private void salvar(Scanner sc) {
			
			int id;
			String endereco;
			String descricao;
			
			
			System.out.println("Informe o Id do registro a ser atualizado");
			id = sc.nextInt();
			System.out.println("Informe o endereço da Unidade de Trabalho.");
			endereco = sc.next();
			System.out.println("Informe o descrição da Unidade de Trabalho");
			descricao = sc.next();
			
			
			UnidadeTrabalho unidade = new UnidadeTrabalho();
			unidade.setId(id);
			unidade.setEndereco(endereco);
			unidade.setDescricao(descricao);
			
			
			unidadeRepository.save(unidade);
			
			System.out.println("Unidade de Trabalho salvo com Sucesso");
			
		}

}
