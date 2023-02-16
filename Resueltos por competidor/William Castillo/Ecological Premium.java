package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int tot = 0;
			int g = sc.nextInt();

			for (int j = 0; j < g; j++) {

				int a1 = sc.nextInt();
				int a2 = sc.nextInt();
				int a3 = sc.nextInt();

				tot += (a1 * a3);

			}
			
			System.out.println(tot);

		}

	}
}