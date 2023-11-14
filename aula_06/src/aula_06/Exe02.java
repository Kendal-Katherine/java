package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe02 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Integer numero;
				
		System.out.println("Digite 5 cores: ");
		for(int contador = 0; contador < 10; contador++) {
			System.out.print("Digite a " + (contador + 1) + "º número: ");
			numeros.add(leia.nextInt());
		}	
		
		System.out.print("\nDigite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		int posicao = numeros.indexOf(numero);
		
		if(posicao != -1) {
			System.out.println("O número " + numero + " foi encontrado na posição: " + posicao);
		}else {
			System.out.println("O número " + numero + " não foi encontrado!" );

		}
	}

}
