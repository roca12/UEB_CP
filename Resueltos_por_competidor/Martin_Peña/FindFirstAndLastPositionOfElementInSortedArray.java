/*
* Autor: pgms1103-afk
* Problema: 34. Find First and Last Position of Element in Sorted Array
* Juez Online: leetcode
* Veredicto: Accepted
* URL: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static boolean encontre;

	public static void main(String[] args) throws NumberFormatException, IOException {

		int longitud = Integer.parseInt(br.readLine());
		String datos[] = br.readLine().split(" ");
		int array[] = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			array[i] = Integer.parseInt(datos[i]);
		}
		int objetivo = Integer.parseInt(br.readLine());

		System.out.println(Arrays.toString(searchRange(array,objetivo)));

	}
	


	static public int si(int[] nums, int target, boolean primero) {

		encontre = false;

		int max = nums.length - 1;
		int min = 0;
		int rta = 0;

		while (min <= max) {
			int rtaMid = (min + max) / 2;
			if (nums[rtaMid] < target) {
				min = rtaMid + 1;
			} else if (nums[rtaMid] > target) {
				max = rtaMid - 1;
			} else {
				encontre = true;
				rta = rtaMid;
				if (primero)
					max = rtaMid - 1;
				else
					min = rtaMid + 1;
			}

		}
		return rta;
	}

	static public int[] searchRange(int[] nums, int target) {
		int rta[] = new int[2];
		if(nums.length == 0) {
			rta[0] = -1;
			rta[1] = -1;
			return rta;
		}
		int inicio = si(nums, target, true);
		int fin = si(nums, target, false);
		if (encontre) {
			rta[0] = inicio;
			rta[1] = fin;
			return rta;
		} else {
			rta[0] = -1;
			rta[1] = -1;
			return rta;
		}

	}

}
