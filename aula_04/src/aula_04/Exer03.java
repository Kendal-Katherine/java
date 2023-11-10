package aula_04;

import java.util.Scanner;

public class Exer03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int idade, menor=0, maior=0;
		
		while(true) {
			
			System.out.print("Digite uma idade ou um número negativo para sair: ");
			idade = leia.nextInt();
			
			if(idade < 0) {
				
				break;
			}
					
			if(idade < 21) {
				menor++;
			}
			if(idade > 50) {
				maior++;
			}
			
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menor); 
		System.out.println("Total de pessoas maiores de 50 anos: " + maior);

	}

}
