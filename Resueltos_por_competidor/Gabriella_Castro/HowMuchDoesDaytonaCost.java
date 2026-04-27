import java.util.*;
public class HowMuchDoesDaytonaCost {
 
 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
 
	        while (t-- > 0) {
	            int n = sc.nextInt();
	            int k = sc.nextInt();
 
	            boolean foundK = false;
 
	            for (int i = 0; i < n; i++) {
	                int val = sc.nextInt();
	                if (val == k) {
	                    foundK = true;
	                }
	            }
 
	            if (foundK)
	                System.out.println("YES");
	            else
	                System.out.println("NO");
	        }
	    }
}	
 
