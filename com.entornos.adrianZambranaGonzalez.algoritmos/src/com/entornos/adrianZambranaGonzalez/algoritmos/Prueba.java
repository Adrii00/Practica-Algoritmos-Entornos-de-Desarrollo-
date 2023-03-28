package com.entornos.adrianZambranaGonzalez.algoritmos;
/**
 * Clase main de prueba para calcular los resultados de distintos algoritmos
 * a partir de un numero
 * 
 * 
 * @version 1.0
 * 
 * @author Adrian_Zambrana
 *
 */
public class Prueba {

	public static void main(String[] args) {
		int array[]= new int[5];
		long resultadoFibonacci[]= new long[5];
		long resultadoFactorial[]= new long[5];
		boolean resultadoPrimos[]= new boolean[5];
		for(int i=0; i<array.length;i++) {
			array[i]= (int) (Math.random()*20)+1;
			resultadoFibonacci[i]=Algoritmos.fibonacci(array[i]);
			resultadoFactorial[i]=Algoritmos.factorial(array[i]);
			resultadoPrimos[i]=Algoritmos.primo(array[i]);
		}
		
	}

}
