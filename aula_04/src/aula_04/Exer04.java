package aula_04;

import java.util.Scanner;

public class Exer04 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int idade, genero, mulherCis=0, homemCis=0, naoBinario=0, mulherTrans=0, homemTrans=0, outros=0;
		int back=0, front=0, mobile=0, full=0, funcao, totalRespostas=0, totalPessoas = 0, somaIdades = 0;
		
		
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			do {
			System.out.println("Digite a sua identidade de gênero (1-Mulher Cis/ 2-Homem Cis / 3-Não Binário / 4-Mulher Trans / 5-Homem Trans / 6-Outros: ");
			genero = leia.nextInt();
				if(genero < 1 || genero > 6) {
					System.out.println("Digite um número entre 1 e 6");
				}
				
				System.out.println("Digite a sua função (1-Backend/ 2-Frontend / 3-Mobile / 4-FullStack: ");
				funcao = leia.nextInt();
					if(funcao < 1 || funcao > 4) {
						System.out.println("Digite um número entre 1 e 4");
					}
			
			} while(genero < 1 || genero > 6);
			//O número de pessoas desenvolvedoras Backend
			if(funcao == 1) {
				back ++;
			}
			
			//O número de Mulheres Cis e Trans desenvolvedoras Frontend
			if((genero == 1 || genero == 4) && funcao == 2){
				front ++;
				}
			//O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
			if((genero == 2 || genero == 5) && funcao == 3 && idade >= 40) {
				mobile ++;
				}
			//O número de Não Binários desenvolvedores FullStack menores de 30 anos
			if(genero == 3 && funcao == 4 && idade <= 30) {
				full ++;
				}
			//O número total de pessoas que responderam à pesquisa
			if(idade>0) {
				totalRespostas ++;
			}
			
			System.out.println("Deseja continuar a leitura dos dados (S/N) ?");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
			
			 	somaIdades += idade;
	            totalPessoas++;
		
		}

		System.out.println("Total de pessoas desenvolvedoras Backend: " + back);
		System.out.println("Total de mulheres cis e trans desenvolvedoras Frontend: " + front);
		System.out.println("Total de homens cis e trans desenvolvedores Mobile maiores de 40 anos: " + mobile);
		System.out.println("Total de Não binários desenvolvedores FullStack menores de 30 anos: " + full);
		System.out.println("Total de pessoas que responderam a pesquisa: " + totalRespostas);
		
		 if (totalPessoas > 0) {
	            double mediaIdade = (double) somaIdades / totalPessoas;
	            System.out.println("Média de idade das pessoas que responderam à pesquisa: " + mediaIdade);
	        } else {
	            System.out.println("Nenhuma pessoa respondeu à pesquisa.");
	        }

	}

}
