package aula_04;

import java.util.Scanner;

public class Exer01 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int numero1, numero2; 
		
		System.out.print("Digite o primeiro número do intervalo: ");
		numero1 = leia.nextInt();
		
		System.out.print("Digite o segundo número do intervalo: ");
		numero2 = leia.nextInt();

		
		if(numero1 >= numero2) {
			System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo");
		}
		System.out.println("No intervalo de " + numero1 + " a " + numero2 + ":");
		for(int i = numero1; i <= numero2; i++) {
			if(i % 3 == 0 && i % 5 ==0) {
				
				System.out.println(i + " é múltiplos de 3 e 5");
			}
		}
		
	}
	

}
