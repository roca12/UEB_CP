package Problemas;

import java.util.Scanner;

public class ProblemaZ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < casos; i++) {
			String str = sc.nextLine();
			System.out.println("Hello "+str+"!");
		}
	}
}
