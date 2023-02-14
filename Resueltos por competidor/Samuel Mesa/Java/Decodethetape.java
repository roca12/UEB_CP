import java.util.Scanner;

public class Decodethetape {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tope = 0;

		String frase = "";

		while (tope < 2) {
			String cinta = sc.nextLine();
			if (cinta.equals("___________")) {
				tope++;
			} else {
				cinta = cinta.replaceAll(" ", "0");
				cinta = cinta.substring(1, cinta.length() - 1);
				cinta = cinta.replaceAll("o", "1");
				cinta = cinta.substring(0, cinta.indexOf("."))
						+ cinta.substring(cinta.indexOf(".") + 1, cinta.length());
				frase+= (char) Integer.parseInt(cinta,2);				
			}
		}
		System.out.println(frase);
	}
}
