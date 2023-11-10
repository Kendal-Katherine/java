package aula_04;

import java.util.Scanner;

public class TabuadaV2 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero, contador = 1;
		
		System.out.println("Digite um número:");
		numero = leia.nextInt();
		
		while(contador <= 10){
			System.out.println(numero + " X " + contador + " = " + (numero * contador));
			contador ++;
		}
	}

}
