package aula_03;

import java.util.Scanner;

public class Exer06 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		String nome, cargo = "";
		int codigo; 
		double salario, novoSalario, reajuste = 0; 
		
				
		System.out.print("Digite o nome do funcionário: ");
		nome = leia.nextLine();
		
		System.out.print("Digite o código do cargo: ");
		codigo = leia.nextInt();
		
		System.out.print("Digite o valor do salário: ");
		salario = leia.nextDouble();
		
		
		switch(codigo) {
		case 1: 
			cargo = "Gerente";
			reajuste = 0.1;
			break;
		case 2: 
			cargo = "Vendedor";
			reajuste = 0.07;
			break;
		case 3: 
			cargo = "Supervisor";
			reajuste = 0.09;
			break;
		case 4: 
			cargo = "Motorista";
			reajuste = 0.06;
			break;
		case 5: 
			cargo = "Estoquista";
			reajuste = 0.05;
			break;
		case 6: 
			cargo = "Técnico de TI";
			reajuste = 0.08;
			break;
			default:
				System.out.println("Opção inválida");
		}

		novoSalario = salario + (salario * reajuste);
		
		System.out.println("____________________________________");
		System.out.printf("\nFuncionário: %s\nCargo: %s\nSalário com reajuste: R$ %.2f\n", nome, cargo, novoSalario);

		
	}

}
