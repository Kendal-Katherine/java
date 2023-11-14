package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Exe03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		HashSet<String> numeros = new HashSet<String>();
		
		System.out.println("Digite 10 valores: ");
		for(int contador = 0; contador < 10; contador++) {
			System.out.print("Digite a " + (contador + 1) + "º valor: ");
			numeros.add(leia.next());
		}
		
		Iterator<String> iNumeros = numeros.iterator();
		
		while(iNumeros.hasNext())
			System.out.println(iNumeros.next());

	
	}
	
}

