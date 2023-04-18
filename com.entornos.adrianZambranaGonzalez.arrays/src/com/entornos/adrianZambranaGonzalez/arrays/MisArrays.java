package com.entornos.adrianZambranaGonzalez.arrays;

/**
 * Clase abstracta que contiene distintos metodos para
 * calcular operaciones con arrays para
 * la practica de Entornos de desarrollo
 * 
 * @version 1.0
 * 
 * @author Adrian_Zambrana
 *
 */

public abstract class MisArrays {
	
	/**
	 * Metodo media que recibe por parametro un array de enteros, y devuelve la media
	 * de los valores de los elementos del array
	 * @param un array de numeros enteros
	 * @return la media de ese array de numeros
	 * 
	 */
	public static double media(int[] array) {
		
		double suma=0;
		for(int i =0; i<array.length;i++) {
			suma+=array[i];
		}
		return suma/array.length;
	}
	/**
	 * Metodo mediana que recibe por parametro un array, y devuelve la mediana de dicho array
	 * @param un array de numeros enteros
	 * @return la mediana de ese array
	 */
	
	public static double mediana(int[] array) {
		
		double mediana;
		int mitad = array.length / 2;
		// Si la longitud es par, se debe poner la media de los dos centrales
		if (array.length % 2 == 0) {
		    mediana = (double)(array[mitad - 1] + array[mitad]) / 2;
		} else {
		    mediana = array[mitad];
		}
		return mediana;
	}

	/**
	 * Metodo primo que recibe por parametro un numero, y devuelve true si es primo
	 * y false si no lo es
	 * 
	 * @return si un numero es primo
	 */
	
	public static boolean primo(int n) {
		
		if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	

}