package aula_02;

import java.util.Scanner;

public class Exer03 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float salarioBruto, salarioLiquido, adicionalNoturno, horasExtras, descontos;
		
		System.out.println("Digite o salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite as horas extras trabalhadas: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor dos descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		System.out.println("O funcionário receberá o valor de: R$: " + salarioLiquido);



	}

}
