import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	
	/*
	 * Autor: Carlos Eduardo Cobaleda Moreno
	 * Problema: A. Team
	 * Juez online: CodeForces
	 * Veredicto: Accepted
	 * URL: https://codeforces.com/contest/231/problem/A
	 */

	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int contador = 0;
	
		for (int i = 0; i<n; i++ ) {
		int p = sc.nextInt();
		int v = sc.nextInt();
		int t = sc.nextInt();
		
		if(p + v + t >= 2) {
		    contador++;
		 }

    	}
	
	System.out.println(contador);
    }
}

