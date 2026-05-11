/*
 * Autor: natar2005
 * Problema: Yet Another Coins Problem 
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/problemset/problem/1934/B
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class YetAnotherCoinProblem {
	

    static final int[] monedas= {1, 3, 6, 10, 15};
    static final int LIM=100;
    public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		//Creacion del dp
		int[]dp= new int[LIM+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0]=0;
		// llenarlo
		for( int i=1; i<=LIM; i++) {
			for (int moneda: monedas) {
				if(i>=moneda) {
					dp[i]=Math.min(dp[i], dp[i-moneda]+1);
				}
			}
		}
		
		while(t>0) {
			t--;
			long n= Long.parseLong(br.readLine());
			long resultado=Long.MAX_VALUE;
			
			long maxMon15= n /15;
			for(long k=Math.max(0, maxMon15-10);k<=maxMon15;k++) {
				long restante=n-k*15;
				if(restante<=LIM) {
					resultado=Math.min(resultado, dp[(int) restante]+k);
				}
			}
			System.out.println(resultado);
		}
	}
}