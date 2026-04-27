//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import java.util.*;

public class Fort {
    public static void main(String[] args) {
   // 	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long m = sc.nextLong();
            boolean isPractical = revisarSiEsPractico(m);
            if (isPractical) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

 
    public static boolean revisarSiEsPractico(long m) {
        
        List<Long> divisors = new ArrayList<>();
        for (long i = 1; i * i <= m; i++) {
            if (m % i == 0) {
                divisors.add(i);
                if (i != m / i) {
                    divisors.add(m / i);
                }
            }
        }
        
      
        boolean[] dp = new boolean[(int) m];
        dp[0] = true;
        for (long divisor : divisors) {
            for (int i = (int) m - 1; i >= (int) divisor; i--) {
                dp[i] = dp[i] || dp[i - (int) divisor];
            }
        }
        
        for (int i = 1; i < m; i++) {
            if (!dp[i]) {
                return false;
            }
        }
        
        return true;
    }
}

