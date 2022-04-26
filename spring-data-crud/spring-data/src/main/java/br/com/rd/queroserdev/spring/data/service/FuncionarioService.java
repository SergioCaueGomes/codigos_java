package br.com.rd.queroserdev.spring.data.service;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.rd.queroserdev.spring.data.orm.Cargo;
import br.com.rd.queroserdev.spring.data.orm.Funcionario;
import br.com.rd.queroserdev.spring.data.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	private final FuncionarioRepository funcionarioRepository;
	private Boolean sistema = true;

	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
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
		
		funcionarioRepository.deleteById(id);
		
		System.out.println("Funcionario deletado com sucesso");

	}

	private void visualizar() {
		Iterable<Funcionario> funcionarios = funcionarioRepository.findAll();
		funcionarios.forEach(funcionario -> System.out.println(funcionario));
	}

	private void atualizar(Scanner sc) {
		int id;
		String nome;
		String cpf;
		String cargo;
		LocalDate data_contratacao;
		
		
		System.out.println("Informe o Id do registro a ser atualizado");
		id = sc.nextInt();
		System.out.println("Informe o nome do Funcionario.");
		nome = sc.next();
		System.out.println("Informe o CPF do Funcionario");
		cpf = sc.next();
		System.out.println("Informe o Cargo do funcionario");
		cargo = sc.next();
		System.out.println("Informe a data de contratação do funcionario");
		data_contratacao = LocalDate.now();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setId(id);
		funcionario.setNome(nome);
		funcionario.setCpf(cpf);
		funcionario.setData_contratacao(data_contratacao);
		
		Cargo cargos = new Cargo();
		cargos.setDescricao(cargo);
		
		
		funcionarioRepository.save(funcionario);
		
		System.out.println("Cargo Atualizado com Sucesso");

	}

	private void salvar(Scanner sc) {
		
		String nome;
		String cpf;
		String cargo;
		LocalDate data_contratacao;
		
		System.out.println("Informe o nome do Funcionario.");
		nome = sc.next();
		System.out.println("Informe o CPF do Funcionario");
		cpf = sc.next();
		System.out.println("Informe o Cargo do funcionario");
		cargo = sc.next();
		System.out.println("Informe a data de contratação do funcionario");
		data_contratacao = LocalDate.now();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		funcionario.setCpf(cpf);
		funcionario.setData_contratacao(data_contratacao);
		
		Cargo cargos = new Cargo();
		cargos.setDescricao(cargo);
		
		
		funcionarioRepository.save(funcionario);
		
		System.out.println("Cargo Atualizado com Sucesso");

	}

}
