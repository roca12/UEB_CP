import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nCasos = sc.nextInt();

		for (int i = 0; i < nCasos; i++) {
			int nNumeros = 0;
			
			List<Integer> numeros = new ArrayList<>();
			for (int k = 0; k <= 3; k++) {
				nNumeros = sc.nextInt();
				numeros.add(nNumeros);
				//System.out.println(nNumeros);
			}
			int suma = numeros.stream().mapToInt(j -> j).sum();
			System.out.println(suma);
		}
	}

}
