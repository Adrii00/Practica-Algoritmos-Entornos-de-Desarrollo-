package com.entornos.adrianZambranaGonzalez.algoritmos;

public abstract class Algoritmos {

	public static int fibonacci(int n) {

		int suma = 1;
		int n1 = 0;
		int n2 = 1;
		for (int i = 1; i < n; i++) {


			// primero sumamos
			suma = n1 + n2;
			// Despues, cambiamos la segunda variable por la primera
			n1 = n2;
			// Por ultimo, cambiamos la suma por la segunda variable
			n2 = suma;

		}
		return suma;
	}

}
