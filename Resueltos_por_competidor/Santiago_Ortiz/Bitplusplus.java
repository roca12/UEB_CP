import java.util.Scanner;

public class Bitplusplus {

	/*
	 * Autor: Darkovski7   
	 * Problema: Bit++
	 * Juez Online: Codeforces
	 * Veredicto: Accepted 
	 * Url: https://codeforces.com/problemset/problem/282/A
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = 0;
		
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			
			if(s.contains("++")) {
				x++;
			}else if (s.contains("--")) {
				x--;
			}
		}
		System.out.println(x);
	}

}
