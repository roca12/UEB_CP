import java.util.Scanner;
import java.util.HashSet;

public class BoyOrGirl {

	/*
	 * Autor: Darkovski7   
	 * Problema: Boy or Girl
	 * Juez Online: Codeforces
	 * Veredicto: Accepted 
	 * Url: https://codeforces.com/problemset/problem/236/A
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		HashSet<Character> caracteres = new HashSet<>();
		String s = sc.next();
		
		for (int i = 0; i < s.length(); i++) {
			caracteres.add(s.charAt(i));
		}
		if (caracteres.size() % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		}else {
			System.out.println("IGNORE HIM!");
		}
	}

}
