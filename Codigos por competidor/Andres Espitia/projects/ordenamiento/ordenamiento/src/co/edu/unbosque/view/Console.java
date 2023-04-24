package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	private Scanner sc = new Scanner(System.in);
	
	public int readInt() {
		int i = sc.nextInt();
		sc.nextLine();
		return i;
	}
	
	public String readString() {
		return sc.nextLine();
	}
	
	public void printSomething(String message) {
		System.out.println(message);
	}
	
	public void printArray(String[] words, int it) {
		System.out.println("Paso #"+it);
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]+ " ");
		}
		System.out.println();
	}

}
