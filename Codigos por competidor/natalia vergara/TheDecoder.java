import java.util.Scanner;

public class TheDecoder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String palabra = sc.nextLine();
			char[] letras = palabra.toCharArray();
			int[] numeros = new int[letras.length];
			for (int i = 0; i < letras.length; i++) {
				numeros[i] = (int) letras[i] - 7;
			}
			for (int i = 0; i < numeros.length; i++) {
				System.out.print((char) numeros[i]);
			}
			System.out.println();
		}
	}
}
