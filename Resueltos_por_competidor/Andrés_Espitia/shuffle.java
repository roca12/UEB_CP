package nacional2022;

import java.util.Scanner;

public class shuffle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			
			int[] a = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			int[] b = a;
			
			boolean rep = true;
			int cont = -1;
			do {
				for (int i = 0; i < a.length; i++) {
					a[a[i]-1] = i+1;
				}
				for (int i : a) {
					System.out.print(i);
				}
				cont++;
				for (int i = 0; i < b.length; i++) {
					if(a[i]==b[i]) {
						rep = false;
					}else {
						rep = true;
						break;
					}
				}
				System.out.println();
				for (int i : b) {
					System.out.print(i);
				}
			}while(rep);
			System.out.println(cont);
		}
	}
}
