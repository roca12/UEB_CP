/*
* Autor: JMCip
* Problema:Game
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/contest/2199/problem/A
*/

import java.util.Scanner;

public class Game {

	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			
			int K = sc.nextInt();
			int a1 = sc.nextInt();
			int b1 = sc.nextInt();
			int a2 = sc.nextInt();
			int b2 = sc.nextInt();
			
			int sumaAlice = a1 + a2; 
			int sumaBob = b1 + b2; 
			
			int j = 0;
			
			while (j < K) {
				if(sumaBob > sumaAlice ) {
					sumaBob++;
					sumaAlice++;
				}else if (sumaAlice >= sumaBob){
					sumaBob++;
				}
				j++;
			}
			
			if (sumaAlice >= sumaBob) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}	
		}
	
	}
}