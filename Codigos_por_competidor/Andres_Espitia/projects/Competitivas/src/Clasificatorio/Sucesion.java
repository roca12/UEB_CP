package Clasificatorio;



import java.util.Scanner;

public class Sucesion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int caso = 1; caso<=t; caso++) {
			long[] fn = new long[10001];
			for (int i = 0; i <= 5; i++) {
				fn[i] = sc.nextLong();
			}
			int n = sc.nextInt();
			for(int i=6; i<=n; i++) {
				fn[i] = (fn[i-1] + fn[i-2] + fn[i-3] + fn[i-4] + fn[i-5] + fn[i-6])%10000007;
			}
			System.out.println("Case "+caso+": "+fn[n]);
		}
	}
}
