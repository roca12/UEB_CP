import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	/*
	 * Autor: mariana 
	 * Problema : Decimal a Hexadecimal 
	 * Juez online: omegaUp
	 * Veredicto: Accepted 
	 * URL: https://omegaup.com/arena/problem/Decimal-a-hexadeciamal/
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		String a = "";
		a = Long.toHexString(n);
		System.out.println(a);
	}
}
