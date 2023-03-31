import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		// Array ( tamaño fijo, velocidad rapida)
		int[] arraynums = new int[7];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arraynums.length; i++) {
			arraynums[i] = sc.nextInt();
		}
		System.out.println("-----------------");
		for (int i = 0; i < arraynums.length; i++) {
			System.out.println("pos: " + i + " -> " + arraynums[i]);
		}
		System.out.println("----------");
		// tim sort
		Arrays.sort(arraynums);

		System.out.println("-----------------");
		for (int i = 0; i < arraynums.length; i++) {
			System.out.println("pos: " + i + " -> " + arraynums[i]);
		}
		// busqueda binaria
		System.out.println(Arrays.binarySearch(arraynums, -2));
		
		//comparacion 0 si son iguales, positivo si es mas grande, neg si es mas pequeño
		System.out.println(Arrays.compare(arraynums, arraynums));
		
		System.out.println(Arrays.toString(arraynums));

	}

}
