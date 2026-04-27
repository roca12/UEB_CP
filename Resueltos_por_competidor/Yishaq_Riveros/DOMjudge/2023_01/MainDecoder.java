package co.edu.unbosque;

import java.util.Scanner;

public class MainDecoder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String word = sc.nextLine();
			char[] letras = word.toCharArray();
			int[] num = new int[letras.length];
			for (int i = 0; i < letras.length; i++) {
				num[i] = (int) letras[i] - 7;
			}
			for (int i = 0; i < num.length; i++) {
				System.out.print((char) num[i]);
			}
			System.out.println();
		}
	}
}
