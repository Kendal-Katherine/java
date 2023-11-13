package aula_05;

import java.util.Scanner;

public class Exer03 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int soma1 = 0, soma2 = 0;
		
		System.out.println("Matriz primária: ");
		for (int primaria = 0; primaria < 3; primaria++ ) {
			System.out.print(matriz[primaria][primaria] + " ");
			soma1 += matriz[primaria][primaria];
			
		}
		
		System.out.println("\nMatriz secundária: ");
		for (int secundaria = 0; secundaria < 3; secundaria ++) {
			System.out.print(matriz[secundaria][2 - secundaria] + " ");
			soma2 += matriz[secundaria][secundaria];
			
		}

		System.out.println("\nSoma dos elementos da diagonal principal: ");
		System.out.println(soma1);
		
		System.out.println("Soma dos elementos da diagonal secundária: ");
		System.out.println(soma2);

	}

}
