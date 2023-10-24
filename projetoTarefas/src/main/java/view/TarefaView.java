package view;

import java.util.Scanner;

import model.Prioridade;

public class TarefaView {
	Scanner scanner;

	public TarefaView() {
		scanner = new Scanner(System.in);
	}
	
	public int menu() {
		System.out.println("--- menu ---");
		System.out.println();
		System.out.println("1. Cadastrar Tarefa");
		System.out.println("2.");
		int opcao = scanner.nextInt();
		scanner.nextLine();
		return opcao;
	}
	
	public String getTitulo() {
		System.out.println("Titulo:");
		return scanner.nextLine();
	}
	public String getDescricao() {
		System.out.println("Descricao: ");
		return scanner.nextLine();
	}
	public String getDataCriacao() {
		System.out.println("data de criacao:");
		return scanner.nextLine();
	}
	public String getDatavencimento() {
		System.out.println("data de vencimento:");
		return scanner.nextLine();
	}
	
	
	// sub menu só para class de enum.	
	public Prioridade menuP() {
		for(Prioridade prioridade :Prioridade.values()) {
			System.out.println(prioridade.getId()+"--"+prioridade.getDescricao());
		}
		int id = scanner.nextInt();
		for(Prioridade prioridade : Prioridade.values()) {
			if(prioridade.getId() == id) {
				return prioridade;
			}
		}
		return null;
	}
	
	

}
