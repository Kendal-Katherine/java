package aula_06;

import java.util.Scanner;
import java.util.Stack;

public class ExePilha {

		static Scanner leia = new Scanner(System.in);
		
		public static void main(String[] args) {

			Stack<String> pilha = new Stack<String>();
			int opcao;
			String nome;
			
			do {
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Adicionar Livro na fila");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da fila");
			System.out.println("0 - Sair");
			opcao = leia.nextInt();
			
			
			switch(opcao) {
			case 1: 
				leia.nextLine();
				System.out.print("Digite o nome do Livro: ");
				nome = leia.nextLine();
				pilha.add(nome);
				System.out.println("O Livro foi adicionado!\n");
				break;
				
				
			case 2: 
				System.out.println("\nLista de Livro na fila: ");
				System.out.println(pilha);
				System.out.println("\n");
				break;
				
				
			case 3:
				System.out.println("\nO Livro foi retirado da pilha!\n");
				pilha.pop();
				System.out.println("Pilha: ");
				System.out.println(pilha);
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


