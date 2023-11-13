package aula_05;

import java.util.Scanner;

public class Matrizes {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		double[][] matrizDouble = new double [3][3];
		
		//Matriz irregular 2x3
		//int [][] matrizIrregular = {{1, 2, 3}, {4, 5, 6}};
		
		//Matriz irregular 3x2
		int [][] matrizIrregular = {{1, 2}, {3, 4}, {5, 6}};
		
		//Primeiro indice controla a linha
		/*for(int indiceI = 0; indiceI < matriz.length; indiceI ++) {
			//Segundo indice controla a coluna
			for(int indiceJ = 0; indiceJ < matriz.length; indiceJ ++) {
				System.out.println("Matriz[" + indiceI +"][" + indiceJ + "] = " + matriz[indiceI][indiceJ]);
			}
		}
		
		System.out.println("");
		
		for(int indiceI = 0; indiceI < matrizDouble.length; indiceI ++) {
			//Segundo indice controla a coluna
			for(int indiceJ = 0; indiceJ < matrizDouble.length; indiceJ ++) {
				matrizDouble[indiceI][indiceJ] = leia.nextDouble();
			}
		}
		for(int indiceI = 0; indiceI < matrizDouble.length; indiceI ++) {
			//Segundo indice controla a coluna
			for(int indiceJ = 0; indiceJ < matrizDouble.length; indiceJ ++) {
				System.out.println("Matriz[" + indiceI +"][" + indiceJ + "] = " + matrizDouble[indiceI][indiceJ]);
			}
		}
		*/
		for(int indiceI = 0; indiceI < matrizIrregular.length; indiceI ++) {
			//Segundo indice controla a coluna
			for(int indiceJ = 0; indiceJ < matrizIrregular[indiceI].length; indiceJ ++) {
				System.out.println("Matriz[" + indiceI +"][" + indiceJ + "] = " + matrizIrregular[indiceI][indiceJ]);
			}
		}
		System.out.println("\n");
		for(int[] vetor : matrizIrregular) {
			for(int elemento : vetor) {
				if(elemento%2 == 0) {
				System.out.println(elemento);}		
			}
		}
	}

}
