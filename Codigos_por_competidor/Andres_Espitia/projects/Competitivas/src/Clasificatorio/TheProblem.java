package Clasificatorio;

import java.util.Scanner;

public class TheProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int i = sc.nextInt(), j = sc.nextInt();
			System.out.print(i + " " + j + " ");
			if (i > j) {
				int aux = j;
				j = i;
				i = aux;
			} 
			int aux = 0;
			int mayor = 0;
			for (int r = i; r <= j; r++) {
				aux = r;
				int cont = 1;
				while (aux > 1) {
					if (aux%2 != 0) {
						aux = (aux*3) + 1;
					} else {
						aux = aux/2;
					}
					cont++;
				}
				if (cont>mayor) mayor = cont;
			}
			System.out.println(mayor);
		}
	}

}