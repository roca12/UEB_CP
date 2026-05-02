/*
 * Autor: Gabriella Castro
 * Problema: Word
 * Juez online: Codeforces
 * Veredicto: Accepted / Correct / Yes / Ok
 * URL: https://codeforces.com/problemset/problem/59/A
 */


import java.util.Scanner;

public class Word {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String palabra = sc.next();
		int mayuscula = 0;
		int minuscula = 0;
		
		for(int i = 0; i < palabra.length() ; i++ ) {
			
			char c = palabra.charAt(i);
			
			if(c == Character.toUpperCase(c)) {
				mayuscula++;
			}else {
				minuscula++;
			}
			
		}
		if(mayuscula > minuscula) {
			System.out.println(palabra.toUpperCase());
		}else {
			System.out.println(palabra.toLowerCase());
		}
		
		
	}

}
