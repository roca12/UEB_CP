package codechef;

import java.util.Scanner;

public class tabla_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese hasta que numero quiere ver la tabla del 9");
		int t=sc.nextInt();
		int tabla, i = 0;
		while (t-->0) {
			i=i+1;
			tabla=9*i;
			System.out.println(tabla);
			
		}
	}

}
