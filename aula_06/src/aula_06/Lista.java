package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<Double>();
		Double numero;
		/*
		System.out.println("Digite uma nota: ");
		numero = leia.nextDouble();
		
		notas.add(numero);
		*/
		notas.add(7.0);
		notas.add(4.0);
		notas.add(6.0);
		notas.add(7.0);
		notas.add(9.0);
		//É NECESSÁRIO NO INICIO DO FOR DECLARAR A VARÍAVEL 
		/*for(Double nota : notas) 
			System.out.println(nota);
		*/
		//USANDO VAR NÃO PRECISA DECLARAR 
		for(var nota : notas)
			System.out.println(nota);
		
		//IMPRIME TODOS OS VALORES DA COLLECTION 
		System.out.println(notas);
		
		//Localiza a posição do valor informado, mas se houver mais de um ele retorna somente o primeiro que foi encontrado
		System.out.println("Posição do elemento 7: " + notas.indexOf(7.0));
		
		//Checar se um elemento existe
		System.out.println("Existe o elemento 7? " + notas.contains(7.0));
		
		//localizar o elemento em determinada posição
		System.out.println("Existe na posição 0: " + notas.get(0));
		
		//apagar um dado com índice
		notas.remove(3);
		System.out.println(notas);
		
		//for Each mais simples
		notas.forEach(System.out::println);
		
		
		//Apaga todos os elementos da minha lista
		notas.clear();
		
		//verificar se está vazia ou não
		System.out.println("A lista está vazia ? " + notas.isEmpty());
		
	}

}
