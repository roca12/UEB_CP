package ClasificaroriaNacional;

import java.util.HashSet;
import java.util.Scanner;

public class HangmanJudge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		while(true) {
			int err = 7;
			int r = sc.nextInt();
			if (r == -1) {
				continuar = false;
				break;
			}
			System.out.println("Round "+r);
			sc.nextLine();
			String res = sc.nextLine();
			String op = sc.nextLine();
			int ok = 0;
			HashSet<Character> letras_res = new HashSet<>();
			HashSet<Character> letras_op = new HashSet<>();
			
			for (int i = 0; i < res.length(); i++) {
				letras_res.add(res.charAt(i));
			}
			
			for (int i = 0; i < op.length(); i++) {
				letras_op.add(op.charAt(i));
			}
			
			for (int i = 0; i < op.length(); i++) {
				if (letras_op.contains(op.charAt(i))) {
					letras_op.remove(op.charAt(i));
					if (letras_res.contains(op.charAt(i))) {
						letras_res.remove(op.charAt(i));
					} else {
						err--;
					}
				}
				if (letras_res.isEmpty()) {
					System.out.println("You win.");
					break;
				} 
				if (err == 0) {
					System.out.println("You lose.");
					break;
				}
			}
			
			if (letras_res.isEmpty() == false && err > 0) {
				System.out.println("You chickened out.");
			}
			
		}
	}

}
