package CompSolitario;

import java.util.Scanner;

public class Wave {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			sc.nextLine();
			int amplitud = sc.nextInt();
			int frecuencia = sc.nextInt();
			
			for (int p = 0; p < frecuencia; p++) {
				for (int j = 0; j < amplitud; j++) {
					for (int k = 0; k < j; k++) {
						System.out.print(j);
					}
					System.out.println();
				}
				for (int j = amplitud; j > 0 ; j--) {
					for (int k = 0; k < j; k++) {
						System.out.print(j);
					}
					System.out.println();
				}
			}
			System.out.println();
		}
		
	}

}
