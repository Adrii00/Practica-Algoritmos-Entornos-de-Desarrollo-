package com.entornos.adrianZambranaGonzalez.algoritmos;

/**
 * Clase abstracta que contiene distintos metodos para
 * calcular algoritmos para
 * la practica de Entornos de desarrollo
 * 
 * @version 1.0
 * 
 * @author Adrian_Zambrana
 *
 */

public abstract class Algoritmos {
	
	/**
	 * Metodo fibonacci que recibe por parametro un numero, y devuelve el numero
	 * de fibonacci de ese numero
	 * 
	 * @return el numero de fibonacci de ese numero
	 */
	public static long fibonacci(int n) {
		

		int suma = 1;
		int n1 = 0;
		int n2 = 1;
		for (int i = 1; i < n; i++) {
			suma = n1 + n2;
			n1 = n2;
			n2 = suma;
		}
		return suma;
	}
	/**
	 * Metodo factorial que recibe por parametro un numero, y devuelve el factorial
	 * de ese numero
	 * 
	 * @return el factorial de un numero
	 */
	
	public static long factorial(int n) {
		
		int factorial = 1;
		for (int x=2;x<=n;x++) factorial = factorial * x;
		return factorial;
		
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
