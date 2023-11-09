package aula_03;

import java.util.Scanner;

public class Exer07 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		float numero1, numero2, resultado;
		int codigo;
		
		System.out.println("CALCULADORA MAGNÍFICA");
		System.out.print("\nDigite o primeiro número: ");
		numero1 = leia.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("Escolha uma operação: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1: 
			resultado = (numero1 + numero2);
			System.out.printf("%.2f + %.2f é igual a %.2f", numero1, numero2, resultado);
			break;
		case 2: 
			resultado = (numero1 - numero2);
			System.out.printf("%.2f - %.2f é igual a %.2f", numero1, numero2, resultado);
			break;
		case 3: 
			resultado = (numero1 * numero2);
			System.out.printf("%.2f X %.2f é igual a %.2f", numero1, numero2, resultado);
			break;
		case 4: 
			resultado = (numero1 / numero2);
			System.out.printf("%.2f / %.2f é igual a %.2f", numero1, numero2, resultado);
			break;
			default:
				System.out.println("Opção inválida!");
		}
		
	}

}
