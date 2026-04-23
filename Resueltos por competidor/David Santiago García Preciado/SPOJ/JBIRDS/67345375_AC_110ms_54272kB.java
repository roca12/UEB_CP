import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] data = new int[n];
		int [] bal = new int[2];
		
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}
		
		Arrays.sort(data);
		int left = 0;
		int right = data.length-1;
		boolean inv = false;
		
		while(left<right) {
			if(inv) {
				bal[0] += data[left]+data[right];
				inv = false;
			}else {
				bal[1] += data[left]+data[right];
				inv = true;
			}
			left++;
			right--;
		}
		
		System.out.println(Math.abs(bal[0]-bal[1]));
	}

}
