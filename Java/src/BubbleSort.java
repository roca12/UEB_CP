import java.util.Iterator;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr1 = { 3, 4, 1, 5, 5, -100, 12, -1000 };
		System.out.println("antes:");
		print(arr1);
		System.out.println("despues:");
		arr1 = bubble(arr1);
		print(arr1);
		String[]arr2= {"Diego","Andres Espitia","Andres Lozada"};
		print(arr2);
		arr2=bubble(arr2);
		print(arr2);
	}

	public static int[] bubble(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length - 1; j++) {
				// aqui se cambia
				if (numeros[j] < numeros[j + 1]) {
					int aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
			}
		}
		return numeros;
	}

	public static String[] bubble(String[] cadenas) {
		for (int i = 0; i < cadenas.length; i++) {
			for (int j = 0; j < cadenas.length - 1; j++) {
				// aqui se cambia
				if (cadenas[j].compareTo(cadenas[j + 1]) > 0) {
					String aux = cadenas[j];
					cadenas[j] = cadenas[j + 1];
					cadenas[j + 1] = aux;
				}
			}
		}
		return cadenas;
	}

	public static void print(Object o) {
		if (o instanceof int[]) {
			for (int it : (int[]) o) {
				System.out.print(it+ " ");
			}
			System.out.println();
		} else if (o instanceof String[]) {
			for (String it : (String[]) o) {
				System.out.print(it+" ");
			}
			System.out.println();
		}
	}
}
