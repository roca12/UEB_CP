/*
* Autor: DavsAlejo

* Problema: Noldbach problem
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/problemset/problem/17/A
*/

import java.util.Scanner;
 
public class Main {
 
	static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
 
		int n = sc.nextInt();
		int k = sc.nextInt();
		int contador = 0;
		int primos[] = new int[n];
		int pos = 0;
 
		for (int i = 2; i <= n; i++) {
			
			boolean primo = true;
			for (int divisor = 2; divisor <= Math.sqrt(i); divisor++) {
				if (i % divisor == 0) {
					primo = false;
				}
			}
			if (primo) {
				primos[pos] = i;
				pos++;
			}
		}
		
		  for (int i = 0; i < pos - 1; i++) {
	            int suma = primos[i] + primos[i + 1] + 1;

	            if (suma >= 2 && suma <= n) {

	                boolean esPrimo = true;
	                for (int d = 2; d <= Math.sqrt(suma); d++) {
	                    if (suma % d == 0) {
	                        esPrimo = false;
	                        break;
	                    }
	                }

	                if (esPrimo) {
	                    contador++;
	                }
	            }
	}
		  if(contador >= k) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
}
}
