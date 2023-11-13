package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Exer01 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero;
		
						
		for(int contador = 0; contador < vetor.length; contador ++) {
			System.out.print("Digite o numero que você deseja encontrar: ");
			numero = leia.nextInt();
			
			int posicao = -1;
			for(int indice = 0; indice < vetor.length; indice ++) {
				if(vetor[indice] == numero) {
					posicao = indice;
					break;
				}
				
			}
			if(posicao != -1) {
				System.out.println("\nO numero " + numero + " foi encontrado na posição: " + posicao);
				break;
			}else {
				System.out.println("\nO número " + numero + " não foi encontrado!\n");
			}
			
			}
	}
}



