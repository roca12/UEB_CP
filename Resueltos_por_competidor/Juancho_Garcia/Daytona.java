

/*
 * Autor: Juan Andres Garcia
 * Problema: How Much Does Daytona Cost?
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/1878/A
 **/


import java.util.ArrayList;
import java.util.Scanner;

public class Daytona {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
	
		
		StringBuilder salida = new StringBuilder();
		for (int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			ArrayList<Integer> lista = new ArrayList<>();
			for (int z = 0; z < n; z++) {
				lista.add(sc.nextInt()); 
			}
			
			if(lista.contains(k)) {
				salida.append("YES\n");
			}else {
				salida.append("NO\n");
			}
		
			
		}
		System.out.println(salida.toString());
	}
}
