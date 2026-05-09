/*
* Autor: pgms1103-afk
* Problema: Array Coloring
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/problemset/problem/2191/A
*/

import java.util.Scanner;

public class ArrayColoring {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			boolean respuesta = true;
			int n = sc.nextInt();
			int[] arreglo = new int[n];
			boolean[] color = new boolean[n];

			for (int j = 0; j < arreglo.length; j++) {
				arreglo[j] = sc.nextInt();
			}
			


			for (int j = 0; j < arreglo.length; j++) {
				if (arreglo[j] % 2 == 0) {
					color[j] = true;
				} else {
					color[j] = false;
				}
			}
			
			for (int j = 0; j < color.length-1; j++) {
				boolean posicion = color[j];
                if(color[j+1] == posicion) {
                	respuesta = false;
                	break;
                }
                
			}
			
			if(respuesta == true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
	
			
//			for (int b : arreglo) {
//				System.out.print(b + " ");
//			}

			

		}

	}
}

// for (int cartas : arreglo) {
//
// }