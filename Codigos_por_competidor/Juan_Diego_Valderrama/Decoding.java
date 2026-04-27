import java.util.Scanner;

public class Decoding {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while (sc.hasNext()) {
			String line = sc.nextLine();
			String newline = "";
			for (int i = 0; i < line.length(); i++) {
				int ascii = (int) line.charAt(i) - 7;
				char newchar = (char)ascii;
				newline += newchar;
			}
			System.out.println(newline);
			
		}
	}
}
