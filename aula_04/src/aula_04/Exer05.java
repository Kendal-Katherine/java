
package aula_04;

import java.util.Scanner;

public class Exer05 {
	
	static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número inteiro (ou 0 para sair): ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero;
            }

        } while (numero != 0);

        System.out.println("A soma dos números positivos digitados é: " + soma);

    }
}
