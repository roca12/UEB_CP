/*
 * Autor: natar2005
 * Problema: Nearly Lucky Number 
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/110/A
 */
import java.util.Scanner;

public class NearlyLuckyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//manejamos el numero como un string porque nos interesa es si tiene 4 o 7 no el numero como tal
		String n = sc.next();

		int cont = 0;

		for (int i = 0; i < n.length(); i++) {
			//vamos revisando si cada numero contenido dentro del numero grande es 4 || 7
			char num = n.charAt(i);

			if (num == '4' || num == '7')
				cont++;
		}

		if (isLuckyNumber(cont))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	static boolean isLuckyNumber(int num) {
		if (num == 0)
			return false;

		while (num > 0) {
			//El numero debe terminar con un lucky number entonces paraverificarlo lo hacemos % 10
			int ultNum = num % 10;

			if (ultNum != 4 && ultNum != 7)
				return false;

			num /= 10;
		}

		return true;
	}
}