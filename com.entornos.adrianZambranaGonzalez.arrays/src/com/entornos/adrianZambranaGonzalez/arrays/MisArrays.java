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
	 * Metodo maximo que recibe por parametro un array de numeros, y devuelve el valor 
	 * maximo del array
	 * @param un array de numeros enteros
	 * @return el maximo de ese array
	 */
	
	public static int maximo(int[] array) {
		
		int mayor = array[0];
		 
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
	}
	
	/**
	 * Metodo minimo que recibe por parametro un array de numeros, y devuelve el valor 
	 * minimo del array
	 * @param un array de numeros enteros
	 * @return el minimo de ese array
	 */
	
	public static int minimo(int[] array) {
		
		int minimo = array[0];
		 
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
	}
}