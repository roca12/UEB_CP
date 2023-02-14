package CompSolitario;

import java.util.Scanner;

public class TrainSwapping {
	static int cont;

	static void bubbleSort(int arr[], int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                cont++;
            }
        }
        bubbleSort(arr, n - 1);
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] train;
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			cont = 0;
			int l = sc.nextInt();
			train = new int[l];
			for (int j = 0; j < l; j++) {
				train[j] = sc.nextInt();
			}
			bubbleSort(train, l);
			System.out.printf("Optimal train swapping takes %d swaps.\n", cont);
		}
	}

}
