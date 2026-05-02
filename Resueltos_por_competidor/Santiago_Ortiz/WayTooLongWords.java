import java.util.Scanner;

public class WayTooLongWords {

	/*
	 * Autor: Darkovski7   
	 * Problema: Way Too Long Words
	 * Juez Online: Codeforces
	 * Veredicto: Accepted 
	 * Url: https://codeforces.com/problemset/problem/71/A
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char first = ' ';
		char last = ' ';
		int length = 0;

		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String w = sc.next();
			if (w.length() > 10) {

				first = w.charAt(0);
				last = w.charAt(w.length() - 1);
				length = (w.length() - 2);

				System.out.println("" + first + length + last);

			} else {

				System.out.println(w);
			}
		}
	}

}
