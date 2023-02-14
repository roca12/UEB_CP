import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int as = sc.nextInt();
		for (int i = 0; i < as; i++) {
			int cont = 0;
			int casos = sc.nextInt();
			int arr[] = new int[casos];
			for (int j = 0; j < casos; j++) {
				int nums = sc.nextInt();
				arr[j] = nums;
			}
			for (int k = 0; k < casos; k++) {
				for (int j = 0; j < casos - 1; j++) {
					if (arr[j] > arr[j + 1]) {
						int cambio = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = cambio;
						cont++;
					}
				}

			}

			System.out.println("Optimal train swapping takes " + cont + " swaps.");
			cont=0;
			
		}

	}

}
