import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int div = a/b;
            int best = 1;
            
            for (int j = 1; j*j <= a; j++) {
            	if(a%j==0) {
            		int left = j;
            		if(left <= div && left>best) {
            			best = left;
            		}
            		
            		int right = a/j;
            		if(right <= div && right>best) {
            			best = right;
            		}
            	}
			}
            System.out.println(best);
        }
    }
}
