package co.edu.unbosque;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExplicacion {
	public static void main(String[] args) {
		//ARRAY (TAMANO FIJO, VELOCIDAD RAPIDA)
		int [] arraynums = new int[7];
		Scanner sc = new Scanner (System.in);
		arraynums[0]=44;
		arraynums[4]=-1000000;
		
		for (int i = 0; i < arraynums.length; i++) {
			arraynums[i]=sc.nextInt();
		}
		
		System.out.println("-------------");
		
		for (int i = 0; i < arraynums.length; i++) {
			System.out.println("pos" +i+"-> "+arraynums[i]);
		}
		System.out.println("_________");
		//tim sort -> algoritmo ordena 
		Arrays.sort(arraynums);
		
		System.out.println("-----------------");
		for (int i = 0; i < arraynums.length; i++) {
			System.out.println("pos" +i+"-> "+arraynums[i]);
		}
		
		//BUSQUEDA BINARIA
		System.out.println(Arrays.binarySearch(arraynums, -2));
		
		//COMPARACION -> 0 SI SON IGUALES, POSITIVO SI ES MAS GRANDE EL 1, NEG SI ES MAS PEQUENO EL 1
		System.out.println(Arrays.compare(arraynums, arraynums));
		
		//llena un array con...
	//	Arrays.fill(arraynums, 69);
		
		System.out.println(Arrays.toString(arraynums));
	}
	

}
