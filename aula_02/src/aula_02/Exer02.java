package aula_02;

import java.util.Scanner;

public class Exer02 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		double n1, n2, n3, n4, media;
		
		System.out.println("Digite a nota 1: ");
		n1 = leia.nextDouble();

		System.out.println("Digite a nota 2: ");
		n2 = leia.nextDouble();

		System.out.println("Digite a nota 3: ");
		n3 = leia.nextDouble();
		
		System.out.println("Digite a nota 4: ");
		n4 = leia.nextDouble();
		
		media = (n1 + n2 + n3 + n4) /4;
		
		System.out.println("A média foi: " + media);
		

	}

}
