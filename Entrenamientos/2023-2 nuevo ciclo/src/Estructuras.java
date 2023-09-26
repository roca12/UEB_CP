import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Estructuras {

	public static void main(String[] args) {

		Random r = new Random();

		LinkedList<Character> listaDobleLazo = new LinkedList<>();
		for (int i = 0; i < 15; i++) {
			// ascii
			char c = (char) r.nextInt(127);
			if (Character.isAlphabetic(c)) {
				listaDobleLazo.addFirst(c);
			} else if (Character.isDigit(c)) {
				listaDobleLazo.addLast(c);
			} else {
				i--;
			}
		}
		//lambda
		listaDobleLazo.forEach((c) -> {
			System.out.print(c);
			System.out.print(" ");
		});
		System.out.println();
		
		
		Queue<Character> cola = new LinkedList<Character>();
		for (int i = 0; i < 7; i++) {
			char c=(char) r.nextInt(127);
			cola.offer(c); 
		}
		System.out.println(cola.toString());
		while(!cola.isEmpty()) {
			System.out.println("El char que esta al frente es "+cola.peek());
			System.out.println("Se va:" + cola.poll());
		}
		System.out.println("Cola vacia");
		
		System.out.println("///////////////////////");
		
		Stack<Character> pila = new Stack<Character>();
		for (int i = 0; i < 7; i++) {
			char c=(char) r.nextInt(127);
			pila.push(c); 
		}
		System.out.println(pila.toString());
		while(!pila.isEmpty()) {
			System.out.println("El char que esta arriba es "+pila.peek());
			System.out.println("Se va:" + pila.pop());
		}
		System.out.println("Pila vacia");
		

//		int [] array= new int[10];
//		for (int i = 0; i < array.length; i++) {
//			array[i]=r.nextInt(1000);
//		}
//		for (int j = 0; j < array.length; j++) {
//			System.out.println(j+" -> "+array[j]);
//		} 
//		
//		int[][] matrix = new int[5][5];
//		
//		Arrays.binarySearch(array, 64);
//		Arrays.fill(array, 0);
//		System.out.println(Arrays.toString(array));
//		
//		//arraylist
//		List<Double> lista= new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			lista.add(r.nextGaussian());
//		}
//		for (int i = 0; i < lista.size(); i++) {
//			System.out.println(i+" -> "+lista.get(i));
//		}
//		ArrayList<ArrayList<Long>> listadelistas= new ArrayList<>();

	}

}
