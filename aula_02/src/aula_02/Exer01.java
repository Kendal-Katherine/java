package aula_02;

import java.util.Scanner;

public class Exer01 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		double salario, abono, novoSalario;
		
		System.out.println("Digite o valor do salário: ");
		salario = leia.nextDouble();

		System.out.println("Digite o valor do abono: ");
		abono = leia.nextDouble();
		
		novoSalario = (salario + abono);
		
		System.out.println("O valor do novo salário é: " + novoSalario);

	}

}
