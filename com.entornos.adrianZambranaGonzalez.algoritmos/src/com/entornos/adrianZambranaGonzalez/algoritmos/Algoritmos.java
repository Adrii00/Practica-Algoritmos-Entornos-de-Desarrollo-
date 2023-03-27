package com.entornos.adrianZambranaGonzalez.algoritmos;

public abstract class Algoritmos {

	public static int fibonacci(int n) {

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
	
	public static int factorial(int n) {
		int factorial = 1;
		for (int x=2;x<=n;x++) factorial = factorial * x;
		return factorial;
		
	}
	
	public static boolean primo(int n) {
		if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
