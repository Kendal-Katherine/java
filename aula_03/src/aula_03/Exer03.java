package aula_03;

import java.util.Scanner;

public class Exer03 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		String nome; 
		int idade; 
		boolean doacao;
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação? ");
		doacao = leia.nextBoolean();
				
		
		if(idade >=60 && idade <= 69 && doacao == false) {
			System.out.printf("%s está apto para doar sangue!", nome);
		}else if (idade >=18 && idade <=59){
			System.out.printf("%s está apto para doar sangue!", nome);
		}else{
			System.out.printf("%s não está apto para doar sangue!", nome);
		}
		
		
		

	}

}
