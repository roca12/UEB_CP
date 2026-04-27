//2209A
//3
import java.util.Arrays;
import java.util.Scanner;

public class flipflops {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            long c = sc.nextLong();
            long k = sc.nextLong();

            long [] a = new long[n];

            for (int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

              for (int i = 0; i < n; i++) {
                if (a[i] > c) break;

                long usar = Math.min(k, c - a[i]); 
                a[i] += usar;
                k -= usar;

                c += a[i];
            }

            System.out.println(c);

        }

    }

}
