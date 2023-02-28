package ay3qwh;

import java.util.ArrayList;
import java.util.Scanner;

public class aeiou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList <String> vocals = new ArrayList<>();
		vocals.add("a");
		vocals.add("e");
		vocals.add("i");
		vocals.add("o");
		vocals.add("u");
		boolean bandera = false;
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			String hola = sc.nextLine();
			bandera = false;
			if (hola.length() < 3) {
				System.out.println("Sad");
			} else {
				for (int j = 0; j < hola.length()-2; j++) {
					if (vocals.contains(hola.charAt(j)+"") && vocals.contains(hola.charAt(j+1)+"") && vocals.contains(hola.charAt(j+2)+"")) {
						bandera = true;
						break;
					}
				}
			}
			
			if (bandera == true) {
				System.out.println("Happy");
			} else {
				System.out.println("Sad");
			}
			
		}
		
	}

}
