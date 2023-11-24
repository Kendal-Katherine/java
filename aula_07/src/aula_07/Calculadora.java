package aula_07;

import java.util.Scanner;

public class Calculadora {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero1, numero2, opcao;
		
		
		while(true) {
		System.out.println("1 - Soma");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("0 - Sair");
		System.out.println("Qual a operação matemática você deseja realizar? ");
		opcao = leia.nextInt();
		
		if(opcao ==0) {
			sobre();
			System.exit(0);
		}
				
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();

		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		switch(opcao) {
			//-> lambida
		case 1 -> System.out.println("Soma: " + somar(numero1, numero2));
		case 2 -> System.out.println("Subtrair: " + subtrair(numero1, numero2));
		case 3 -> System.out.println("Multiplicar: " + multiplicar(numero1, numero2));
		case 4 -> System.out.println("Dividir: " + dividir(numero1, numero2));
		default -> System.out.println("Opção inválida!");
		
			}
		}
				
	}//Métodos com o mesmo nome e com assinaturas diferentes se tratam de uma sobrecarga de métodos 
		static int somar(int numero1, int numero2){
			return numero1 + numero2;
		}
		
		static float somar(float numero1, float numero2){
			return numero1 + numero2;
		}
		static int subtrair(int numero1, int numero2){
			return numero1 - numero2;
		}
		static int dividir(int numero1, int numero2){
			return numero1 / numero2;
		}
		static int multiplicar(int numero1, int numero2){
			return numero1 * numero2;
		}
		
		static void sobre() {
			System.out.println("Calculadora com Métodos");
			System.out.println("Feito por: Kendal Katherine");
		}
		
}	
