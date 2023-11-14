package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Exe01 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		HashSet<String> cores = new HashSet<String>();
		
		System.out.println("Digite 5 cores: ");
		for(int contador = 0; contador < 5; contador++) {
			System.out.print("Digite a " + (contador + 1) + "º cor: ");
			cores.add(leia.next());
		}
		
		System.out.println("\nLista de todas as cores: ");
		System.out.println(cores);
		
		ArrayList<String> coresList = new ArrayList<String>();
		coresList.addAll(cores);
		coresList.sort(null);
		System.out.println("\nCores em ordem: ");
		System.out.println(coresList);
		
		
	}

}
