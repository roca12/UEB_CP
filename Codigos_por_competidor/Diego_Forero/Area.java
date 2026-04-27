package ClasificaroriaNacional;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		double pi = 2 * Math.acos(0.0);
		for (int i = 0; i < t; i++) {
			double r = sc.nextDouble();
			double a_tri = pi * Math.pow(r, 2);
			double a_cua = Math.pow((r*2), 2);
			System.out.println("Case "+(i+1)+": "+Math.round((a_cua - a_tri)*100.0)/100.0);
		}
	}

}
