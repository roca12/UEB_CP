import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Estructuras {

	public static void main(String[] args) {
		// arrays
		Random  r = new Random(55556L);
		
		int [] array= new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i]=r.nextInt(1000);
		}
		for (int j = 0; j < array.length; j++) {
			System.out.println(j+" -> "+array[j]);
		}
		
		int[][] matrix = new int[5][5];
		
		Arrays.binarySearch(array, 64);
		Arrays.fill(array, 0);
		System.out.println(Arrays.toString(array));
		
		
		//arraylist
		//envoltorio
		List<Double> lista= new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			lista.add(r.nextGaussian());
		}
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(i+" -> "+lista.get(i));
		}
		
		ArrayList<ArrayList<Long>> listadelistas= new ArrayList<>();

	}

}
