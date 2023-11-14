package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;


public class Set {

	public static void main(String[] args) {

		HashSet<String> frutas = new HashSet<String>();
		
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Abacate");
		frutas.add("Morango");
		frutas.add("Jaboticaba");
		frutas.add("Kiwi");
		
		System.out.println(frutas);
		
		for(var fruta : frutas)
			System.out.println(fruta.hashCode());
		
		//CONSIGO CONFIRMAR QUE EXISTE, MAS NÃO SABER A POSIÇÃO DELA. DIFERENTE DA LISTA
		System.out.println("A fruta Morango existe: " + frutas.contains("Morango"));
		
		//REMOVE 
		frutas.remove("Morango");
		
		System.out.println(frutas);
		
		Iterator<String> iFrutas = frutas.iterator();
		
		while(iFrutas.hasNext())
			System.out.println(iFrutas.next());
		
		// Criamos o ArrayList
		ArrayList<String> frutasList = new ArrayList<String>();
		
		//Adicionamos toos os elementos da coleção HashSet no ArrayList
		frutasList.addAll(frutas);
		
		//Ordenamos os elementos em ordem crescente... Tudo que tem sorted é mais lento que hash
		frutasList.sort(null);
		
		System.out.println(frutasList);
		
		//Ordenamos os elementos em ordem decrescente. Só funciona se a lista já estiver em orde crescente 
		frutasList.sort(Comparator.reverseOrder());
		
		System.out.println(frutasList);
		
	}

}
