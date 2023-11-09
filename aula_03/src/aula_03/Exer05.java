package aula_03;

import java.util.Scanner;

public class Exer05 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		double total, valor;
		String produto;
		int quantidade, codigo;
		
		System.out.println("Escolha o produto: ");
		System.out.println("1 - Cachorro Quente - R$10,00");
		System.out.println("2 - X-Salada - R$15,00");
		System.out.println("3 - X-Bacon - R$18,00");
		System.out.println("4 - Bauru - R$12,00");
		System.out.println("5 - Refrigerante - R$8,00");
		System.out.println("6 - Suco de Laranja - R$13,00");
		codigo = leia.nextInt();
		
		System.out.print("Digite a quantidade comprada: ");
		quantidade = leia.nextInt();
		
		switch(codigo) {
		case 1: 
			valor = 10.00;
			produto = "Cachorro Quente";
			break;
		case 2: 
			valor = 15.00;
			produto = "X-Salada";
			break;
		case 3: 
			valor = 18.00;
			produto = "X-Bacon";
			break;
		case 4: 
			valor = 12.00;
			produto = "Bauru";
			break;
		case 5: 
			valor = 8.00;
			produto = "Refrigerante";
			break;
		case 6: 
			valor = 13.00;
			produto = "Suco de laranja";
			break;
			default:
				valor = 0;
				produto = "Produto inválido";
				
		}
		
		total = (quantidade * valor);
		System.out.println("____________________________________");
		System.out.printf("Produto: %s\nValor total: R$ %.2f\n", produto, total);



	}

}
