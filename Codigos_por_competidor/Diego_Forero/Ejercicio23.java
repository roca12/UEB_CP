package Comp3;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int p = sc.nextInt();
			int incorrect_answ = n-x;
			int markscorrect = x*3;
			int marksincorrect = -1*incorrect_answ;
			
			if (markscorrect+marksincorrect >= p) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
			
		}

	}

}
