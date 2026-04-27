import java.util.Scanner;

public class Tape {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String linea = sc.nextLine();
		while (true) {
			linea = sc.nextLine();
			if (linea.equals("___________")) {
				break;
			}
			
			linea = linea.replaceAll("[^o ]", "");
			linea = linea.replace(" ", "0");
			linea = linea.replace("o", "1");
			int numascii = Integer.parseInt(linea, 2);
			System.out.print((char)numascii);
		}

	}

}
