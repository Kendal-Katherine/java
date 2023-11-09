package aula_03;

import java.util.Scanner;

public class Exer01 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		int a, b, c, soma;
		
		System.out.print("Digite o número A: ");
		a = leia.nextInt();
		
		System.out.print("\nDigite o número B: ");
		b = leia.nextInt();
		
		System.out.print("\nDigite o número C: ");
		c = leia.nextInt();
		
		soma = a + b;
		
		if(soma > c) {
			System.out.println("A soma de A + B é maior do que C.");
		} else if(soma == c ) {
			System.out.println("A soma de A + B é igual a C.");
		}else{
			System.out.println("A soma de A + B é menor do que C.");
		}
	}

}
