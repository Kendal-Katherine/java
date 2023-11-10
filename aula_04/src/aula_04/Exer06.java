package aula_04;

import java.util.Scanner;

public class Exer06 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	        
			int numero, soma = 0, quantidadeMultiplosDe3 = 0;

	        do {
	            System.out.print("Digite um número inteiro (ou 0 para sair): ");
	            numero = leia.nextInt();

	              if (numero != 0 && numero % 3 == 0) {
	                soma += numero;
	                quantidadeMultiplosDe3++;
	            }

	        } while (numero != 0);

	        double media = 0;
	        if (quantidadeMultiplosDe3 > 0) {
	            media = (double) soma / quantidadeMultiplosDe3;
	        }

	        System.out.println("A média dos números múltiplos de 3 digitados é: " + media);

	    }
	}



