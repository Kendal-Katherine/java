package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		String[] pessoas = {"Luiza", "Aline", "Vinicius", "Antônio", "Vitor", "Samara"};
		
		float[] notas = new float[5]; 
		
		System.out.println("Posição 4 " + pessoas[4]);
		
		for(int indice = 0; indice < 6; indice ++) 
		System.out.println("Posição " + indice + "º = " + pessoas[indice]);
		
		System.out.println("\n");
		
		/*for(int indice = 0; indice < 5; indice ++) {
			System.out.println("Digite um valor para a posição [" + indice + "] = ");
			notas[indice] = leia.nextFloat();
		}//notas.length ele sabe o tamanho do array10
		for(int indice = 0; indice < notas.length; indice ++) {
			System.out.println("Posição " + indice + "º = " + notas[indice]);
		}*/
		
		Arrays.sort(pessoas);
		
		System.out.println("\n");
		//ordem crescente.
		for(int indice = 0; indice < pessoas.length; indice ++) {
			System.out.println("Posição [" + indice + "] = " + pessoas[indice]);
		}
		
		System.out.println("\n");
		//Ordem contrária, de trás para frebte
		for(int indice = pessoas.length - 1; indice >= 0; indice --) {
			System.out.println("Posição [" + indice + "] = " + pessoas[indice]);
		}
		
		//Retorna a posição da informação no array
		System.out.println("Localize o elemento da posição 02: " + Arrays.binarySearch(pessoas, "Aline"));
		//System.out.println("A posição do elemento: " + nome + " é: " Arrays.binarySearch(pessoas, nome));

		
		//Localizar determinada informação no array
		for(int indice = 0; indice < pessoas.length; indice ++) {
			if( pessoas[indice].equalsIgnoreCase("Aline"));
			System.out.println("\nA Aline está na posição: " + indice);
		}
		
		for(String pessoa: pessoas) {
			System.out.println(pessoa);
		}
		
		
		
	}
}
