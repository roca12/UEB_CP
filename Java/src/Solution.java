import java.util.Scanner;

 public class Solution{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			sc.nextLine();
			String s=sc.nextLine();
			int res=kGoodnessString(s, k);
			System.out.println("Case #"+(i+1)+": "+res);
		}

	}

	static int kGoodnessString(String s, int k) {
		int minOperations = 0, x = 0;
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				x++;
			}
		}

		if (x == k) {
			minOperations = 0;
		} else if (x > k) {
			minOperations = x - k;
		} else {
			minOperations = k - x;
		}
		return minOperations;
	}

}
