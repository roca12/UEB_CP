
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> men = new ArrayList<>();
		ArrayList<Integer> women = new ArrayList<>();
		Set<Integer> hashset = new HashSet<>();
		
		while(true) {
			int tmp = sc.nextInt();
			if(tmp == 0) {
				break;
			}
			men.add(tmp);
		}
		
		while(true) {
			int tmp = sc.nextInt();
			if(tmp == 0) {
				break;
			}
			women.add(tmp);
		}
		
		int res1 = men.size();
		int res2 = women.size();
		int res3 = 0;
		
		for (int i = 0; i < men.size(); i++) {
			hashset.add(men.get(i));
		}
		
		for (int i = 0; i < women.size(); i++) {
			hashset.add(women.get(i));
		}
		
		res3 = hashset.size();
		
		int[] fn = new int[res3];
		
		int i = 0;
		for (int num:hashset) {
			fn[i] = num;
			i++;
		}
		Arrays.sort(fn);
		for (int num:fn) {
			System.out.print(num+" ");
		}
		System.out.println("");
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
	}

}
