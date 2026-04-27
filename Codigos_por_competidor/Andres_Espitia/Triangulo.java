package Clasificatorio;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int caso=1; caso<=t; caso++){
			double ab = sc.nextFloat(), ac = sc.nextFloat(), bc = sc.nextFloat(), radio = sc.nextFloat();
			
			double x = radio / (radio+1);
			
			System.out.println("Case "+caso+":  "+ab*Math.sqrt(x));
		}
	}
}
