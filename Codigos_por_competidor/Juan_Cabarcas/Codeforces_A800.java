package GPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeforces_A800 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		if (n % 2 == 0) { // hallar numero par y divisible entre 2
			System.out.println("Yes");
		} else if (n % 2 == 1) { // hallar numero impar no divisible entre 2
			System.out.println("No");
		}

	}

}