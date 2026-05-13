import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : Tesla y las Constantes Enigmaticas
	 * Juez online: omegaUp 
	 * Veredicto: Accepted
	 * URL: https://omegaup.com/arena/problem/ConstantesEnigmaticas/#problems
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea = br.readLine();
		BigInteger bi = BigInteger.ZERO;
		int b = 0;
		for (int i = 0; i < linea.length(); i++) {
			b = linea.charAt(i) - '0';
			bi = bi.add(BigInteger.valueOf(b));
		}
		BigInteger a = BigInteger.valueOf(9);
		if (bi.mod(a).equals(BigInteger.ZERO)) {
			System.out.println("Divisibilidad!");
		} else {
			System.out.println("No es multiplo.");
		}
	}
}
