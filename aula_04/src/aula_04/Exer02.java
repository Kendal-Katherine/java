package aula_04;

import java.util.Scanner;

public class Exer02 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int numero, par=0, impar=0, cont;
		
		for(cont = 1; cont <=10; cont ++) {
			System.out.println("Digite o " + cont + "º número: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				par++ ;
				
			} else {
				impar++;
				
			}
			
		}

		System.out.println("Total de número pares: " + par);
		System.out.println("Total de número ímpares: " + impar);
		
	}

}
