/*
 * Autor: OtherSpanish
 * Problema: Party Monster 
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/contest/2227/problem/B
 */

import java.util.Scanner;

public class B_PartyMonster {

	public static void main(String[] args) {
		//Lectura de datos
		Scanner sc = new Scanner(System.in);
		//Test cases
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			
			//Tamaño de String s
			int n =  sc.nextInt();
			//Quema linea
			sc.nextLine();
			//Lee todo el String s
			String a = sc.nextLine();
			int countA = 0; //Cantidad de "("
			int countB = 0; //Cantidad de ")"
			//Recorre todo el String
			for (int j = 0; j < n; j++) {
				if (a.charAt(j)=='(') { //Condicional para contadores
					countA++;
				} else {
					countB++;
				}
			}
			
			
			//Si hay la misma cantidad de "(" y de ")" entonces se va a poder organizar como
			//Una regular bracket sequence
			if (countA==countB) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
	}

}
