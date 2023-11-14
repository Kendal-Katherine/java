package aula_06;

import java.util.HashSet;
import java.util.Scanner;

public class Exe04 {

	static Scanner leia = new Scanner(System.in);
		
	public static void main(String[] args) {

	HashSet<Integer> numeros = new HashSet<Integer>();
	Integer numero;

	
	System.out.println("Digite 5 cores: ");
	for(int contador = 0; contador < 10; contador++) {
		System.out.print("Digite a " + (contador + 1) + "º número: ");
		numeros.add(leia.nextInt());
	}	
		
	
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
				
		if(numeros.contains(numero)) {
			System.out.println("O número " + numero + " foi encontrado!");
		}else {
			System.out.println("O número " + numero + " não foi encontrado!" );

		}
		
		
	}
}

