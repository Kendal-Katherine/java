package aula_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExeFila {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		int opcao;
		String nome;
		
		do {
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Adicionar Cliente na fila");
		System.out.println("2 - Listar todos os clientes");
		System.out.println("3 - Retirar Cliente da fila");
		System.out.println("0 - Sair");
		opcao = leia.nextInt();
		
		
		switch(opcao) {
		case 1: 
			leia.nextLine();
			System.out.print("Digite o nome do cliente: ");
			leia.skip("\\R");
			nome = leia.nextLine();
			fila.add(nome);
			System.out.println("O cliente foi adicionado!\n");
			break;
			
			
		case 2: 
			System.out.println("\nLista de clientes na fila: ");
			System.out.println(fila);
			System.out.println("\n");
			break;
			
			
		case 3:
			System.out.println("\nO cliente foi chamado!\n");
			fila.remove();
			System.out.println("Fila: ");
			System.out.println(fila);
			System.out.println("\n");
			break;
		
		case 0:
			System.out.println("\nPrograma Finalizado!");
			break;
			
		default: 
			System.out.println("\nOpção Inválida");
			break;
		}
		
		}while(opcao != 0);
				
	}

}
