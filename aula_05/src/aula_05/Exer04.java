package aula_05;

import java.util.Scanner;

public class Exer04 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		double[][] notas = new double [2][4];
		double soma = 0, media;
        double[] medias = new double[2];

		
		System.out.println("Digite as notas: ");
		
		for(int i = 0; i < 2; i++) {
			System.out.println("\nAluno(a/e) " + (i + 1) + ": ");
			for(int j = 0; j < 4; j++) {
				System.out.printf("Nota do bimestre %d: ", (j + 1));
				notas[i][j] = leia.nextDouble();
				
			}
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j  = 0; j < 4; j++) {
				soma += notas[i][j];
			}
			
		}
		
		int i = 0;
		medias[i] = soma / 4;
		soma = 0;

		for(int indiceI = 0; indiceI < 2; indiceI++) {
			System.out.printf("\nAluno(a/e) %d: %.2f\n", (i + 1), medias[i]);
		}
	}

}
