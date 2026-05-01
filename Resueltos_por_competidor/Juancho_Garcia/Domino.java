package ejercicios;

import java.util.Scanner;
/*
* Autor: JuanchoEspriella
* Problema: Domino piling (https://codeforces.com/problemset/problem/50/A)
* Juez online: Codeforce
* Veredicto: accepted  
* ANASHEI
* */


public class Domino {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int totalCasilla = M*N;
		
		int cantDomino = totalCasilla / 2;
		
		System.out.println(cantDomino);
		
	}
}



//ANASHEI