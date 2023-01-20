package codechef;

import java.util.Scanner;

public class Minimum_numbers_of_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = 0;
		while (t-- > 0) {
			float n = sc.nextFloat();
			a = (int) n / 2;
			System.out.println(a);
		}

	}

}
