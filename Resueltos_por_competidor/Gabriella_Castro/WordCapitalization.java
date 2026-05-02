/*
 * Autor: Gabriella Castro
 * Problema: Word Capitalization
 * Juez online: Codeforces
 * Veredicto: Accepted / Correct / Yes / Ok
 * URL: https://codeforces.com/problemset/problem/281/A
 */

import java.util.Scanner;

public class WordCapitalization {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String palabra = sc.next();
		char ch = palabra.charAt(0);
		String capitalizada = ""; 
		
		if(ch == Character.toUpperCase(ch)) {
			
			System.out.println(palabra);
		}else {
			for(int i = 0; i< palabra.length(); i++) {
					
					if(i== 0) {
						capitalizada += Character.toUpperCase(ch);
					}else {	
						capitalizada += palabra.charAt(i);
					}	
			}
			System.out.println(capitalizada);
		}
		
		
	}

}
