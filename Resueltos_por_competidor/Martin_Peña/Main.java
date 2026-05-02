/*
* Autor: pgms1103-afk
* Problema: Producto punto de dos vectores
* Juez Online: omegaUp
* Veredicto: Accepted
* URL: https://omegaup.com/arena/problem/Producto-punto-de-dos-vectores/#problems
*/

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int resultado = 0;
		int contador = 0;
		int a[] = new int[n];
		int b[] = new int[n];
		
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
	
		for(int i = 0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		
		while(contador < n) {
			resultado = a[contador] * b[contador] + resultado;	
			contador++;
		}
		System.out.println(resultado);
		
		
		

	}

}
