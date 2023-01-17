package codechef;

import java.util.Scanner;

public class Sumanum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=10;
		int suma=0;
		do {
			int num=sc.nextInt();
			suma=suma+num;
		} while (t-->1);
		System.out.println("La suma de los 10 numeros es "+suma);
	}

}
